package domain.ball;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class BallGenerator {
	private static final int SIZE = 3;
	private static final int BOUND = 10;

	private final Random random;

	public BallGenerator(int seed) {
		random = new Random(seed);
	}

	private Set<Integer> sample(int size) {
		Set<Integer> numbers = new LinkedHashSet<>();
		while (numbers.size() < size) {
			numbers.add(random.nextInt(BOUND));
		}
		return numbers;
	}

	public Balls generate() {
		Set<Integer> numbers = sample(SIZE);
		return new Balls(new ArrayList<>(numbers));
	}
}
