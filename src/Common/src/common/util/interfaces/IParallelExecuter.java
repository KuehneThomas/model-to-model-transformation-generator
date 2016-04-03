package common.util.interfaces;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IParallelExecuter {
	<TInput, TOutput> List<TOutput> execute(List<TInput> inputs, final ITransformation<TInput, TOutput> action) throws InterruptedException, ExecutionException;

	public interface ITransformation<TInput, TOutput> {
		TOutput execute(TInput input) throws Exception;
	}
	
	<TInput> void execute(List<TInput> inputs, final IAction<TInput> action) throws InterruptedException, ExecutionException;

	public interface IAction<TInput> {
		void execute(TInput input) throws Exception;
	}
}
