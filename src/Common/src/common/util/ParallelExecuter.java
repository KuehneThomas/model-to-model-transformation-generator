package common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.inject.Inject;
import javax.inject.Singleton;

import common.util.interfaces.IParallelExecuter;

@Singleton
public class ParallelExecuter implements IParallelExecuter {

	@Inject
	public ParallelExecuter() {

	}
	
	protected int getNumberOfThreads() {
		return Runtime.getRuntime().availableProcessors();
	}

	public <TInput, TOutput> List<TOutput> execute(List<TInput> inputs, final ITransformation<TInput, TOutput> transformation) throws InterruptedException, ExecutionException {

		int threads = getNumberOfThreads();
		ExecutorService service = Executors.newFixedThreadPool(threads);

		List<Future<TOutput>> futures = new ArrayList<Future<TOutput>>();
		for (final TInput input : inputs) {
			Callable<TOutput> callable = new Callable<TOutput>() {
				public TOutput call() throws Exception {
					return transformation.execute(input);
				}
			};
			futures.add(service.submit(callable));
		}

		service.shutdown();

		List<TOutput> outputs = new ArrayList<TOutput>();
		for (Future<TOutput> future : futures) {
			outputs.add(future.get());
		}
		return outputs;
	}

	@Override
	public <TInput> void execute(List<TInput> inputs, final IAction<TInput> action) throws InterruptedException, ExecutionException {
		int threads = getNumberOfThreads();
		ExecutorService service = Executors.newFixedThreadPool(threads);

		List<Future<Object>> futures = new ArrayList<Future<Object>>();
		for (final TInput input : inputs) {
			Callable<Object> callable = new Callable<Object>() {
				public Object call() throws Exception {
					action.execute(input);
					return null;
				}
			};
			futures.add(service.submit(callable));
		}

		// this is just to synchronize all threads..
		List<Object> outputs = new ArrayList<Object>();
		for (Future<Object> future : futures) {
			outputs.add(future.get());
		}
		service.shutdown();
	}
}
