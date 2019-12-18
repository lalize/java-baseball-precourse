package domain.ball;

import java.util.Objects;

public class BallNumber {
	private static final int MIN = 1;
	private static final int MAX = 9;
	private static final String RANGE_ERROR = MIN + " ~ " + MAX + " 사이의 값이 아닙니다.";
	private static final int SAME = 1;
	private static final int DIFFERENCE = 0;

	private final int number;

	public BallNumber(int number) {
		validate(number);
		this.number = number;
	}

	public static void validate(int number) {
		if (number < MIN || number > MAX) {
			throw new IllegalArgumentException(RANGE_ERROR);
		}
	}

	public int get() {
		return number;
	}

	public int compareTo(BallNumber that) {
		if (number == that.number) {
			return SAME;
		}
		return DIFFERENCE;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BallNumber that = (BallNumber)o;
		return number == that.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
