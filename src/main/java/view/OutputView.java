package view;

import domain.action.Result;

public class OutputView {
	private static final String GUESS_SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

	public static void renderGuessResult(Result result) {
		StringBuilder sb = new StringBuilder();
		if (result.hasStrike()) {
			sb.append(result.getStrike());
			sb.append(" 스트라이크 ");
		}
		if (result.hasBall()) {
			sb.append(result.getBall());
			sb.append(" 볼");
		}
		if (result.isNothing()) {
			sb.append("낫싱");
		}
		System.out.println(sb.toString());
	}

	public static void renderGuessSuccess() {
		System.out.println(GUESS_SUCCESS_MESSAGE);
	}
}
