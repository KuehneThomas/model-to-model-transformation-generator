package common.util.interfaces;

import java.util.List;
import java.util.Set;

public interface IRandomizer {
	<T> T getRandomElementFrom(List<T> list);

	<T> T getRandomElementFrom(Set<T> list);

	<T> T getRandomElementFrom(T[] array);
}
