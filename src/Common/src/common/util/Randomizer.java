package common.util;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Singleton;

import common.util.interfaces.IRandomizer;

@Singleton
public class Randomizer implements IRandomizer {

	@Override
	public <T> T getRandomElementFrom(List<T> list) {
		return list != null && list.size() > 0 ? list.get(ThreadLocalRandom.current().nextInt(list.size())) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getRandomElementFrom(Set<T> set) {
		return (T) getRandomElementFrom(set.toArray());
	}

	@Override
	public <T> T getRandomElementFrom(T[] array) {
		return array != null && array.length > 0 ? array[ThreadLocalRandom.current().nextInt(array.length)] : null;
	}
}
