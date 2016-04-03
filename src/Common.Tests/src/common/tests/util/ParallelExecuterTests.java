package common.tests.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.util.ParallelExecuter;
import common.util.interfaces.IParallelExecuter;
import common.util.interfaces.IParallelExecuter.ITransformation;

public class ParallelExecuterTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("serial")
	@Test
	public void testExecute() throws InterruptedException, ExecutionException {
		IParallelExecuter parallelExecuter = new ParallelExecuter();

		List<Integer> inputs = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
			}
		};

		List<String> outputs = parallelExecuter.execute(inputs,
				new ITransformation<Integer, String>() {

					@Override
					public String execute(Integer input) {
						return input.toString();
					}

				});

		List<String> expected = new ArrayList<String>() {
			{
				add("1");
				add("2");
			}
		};
		assertArrayEquals(expected.toArray(), outputs.toArray());
	}

	@SuppressWarnings("serial")
	@Test
	public void testExecuteForParallization() throws InterruptedException,
			ExecutionException {
		IParallelExecuter parallelExecuter = new ParallelExecuter();

		List<Integer> inputs = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
			}
		};

		List<String> outputs = parallelExecuter.execute(inputs,
				new ITransformation<Integer, String>() {

					@Override
					public String execute(Integer input) {
						return Thread.currentThread().getName();
					}

				});

		assertNotEquals(outputs.get(0), outputs.get(1));
	}

}
