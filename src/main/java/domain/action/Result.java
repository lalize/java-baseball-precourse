package domain.action;

public class Result {
	private static final int ZERO = 0;
	private static final int THREE = 3;

	private final int strike;
	private final int ball;

	public Result(int strike, int ball) {
		this.strike = strike;
		this.ball = ball;
	}

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	public boolean hasStrike() {
		return strike > ZERO;
	}

	public boolean hasBall() {
		return ball > ZERO;
	}

	public boolean isNothing() {
		return !hasStrike() && !hasBall();
	}

	public boolean isThreeStrike() {
		return strike == THREE;
	}
}
