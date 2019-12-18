package domain.ball;

public class BallNumber {
	private static final int MIN = 1;
	private static final int MAX = 9;
	private static final String RANGE_ERROR = MIN + " ~ " + MAX + " 사이의 값이 아닙니다.";

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
}
