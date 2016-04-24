package common.util;

import java.util.concurrent.Callable;

public class Throwables {

	// a simplified version of Throwables#propagate
	public static RuntimeException runtime(Throwable e) {
		if (e instanceof RuntimeException) {
			return (RuntimeException) e;
		}

		return new RuntimeException(e);
	}

	// this is a new one, n/a in public libs
	// Callable just suits as a functional interface in JDK throwing Exception
	public static <V> V propagate(Callable<V> callable) {
		try {
			return callable.call();
		} catch (Exception e) {
			throw runtime(e);
		}
	}
}
