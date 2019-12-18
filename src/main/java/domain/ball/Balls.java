package domain.ball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Balls {
	private static final int SIZE = 3;
	private static final String OVERLAP_ERROR = "같은 숫자가 존재합니다.";
	private static final String SIZE_ERROR = SIZE + "자리의 수가 아닙니다.";
	private static final int ZERO = 0;
	private static final int NONE = -1;

	private final List<BallNumber> balls = new ArrayList<>();

	public Balls(List<Integer> numbers) {
		validate(numbers);
		numbers.stream().map(BallNumber::new).forEach(balls::add);
	}

	public static void validate(List<Integer> numbers) {
		checkOverlap(numbers);
		checkSize(numbers);
	}

	private static void checkOverlap(List<Integer> numbers) {
		if (new HashSet<>(numbers).size() != numbers.size()) {
			throw new IllegalArgumentException(OVERLAP_ERROR);
		}
	}

	private static void checkSize(List<Integer> numbers) {
		if (numbers.size() != SIZE) {
			throw new IllegalArgumentException(SIZE_ERROR);
		}
	}

	private int plusOneIfIsStrike(BallNumber number, int index) {
		return balls.get(index).compareTo(number);
	}

	public int countOfStrike(Balls that) {
		int count = ZERO;
		for (int i = ZERO; i < SIZE; i++) {
			count += plusOneIfIsStrike(that.balls.get(i), i);
		}
		return count;
	}

	private int plusOneIfIsBall(BallNumber number, int index) {
		int findIndex = balls.indexOf(number);
		return Boolean.compare(findIndex != index, findIndex == NONE);
	}

	public int countOfBall(Balls that) {
		int count = ZERO;
		for (int i = ZERO; i < SIZE; i++) {
			count += plusOneIfIsBall(that.balls.get(i), i);
		}
		return count;
	}
}
