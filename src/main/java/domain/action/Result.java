package domain.action;

public class Result {
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

	public boolean isThreeStrike() {
		return strike == THREE;
	}
}
