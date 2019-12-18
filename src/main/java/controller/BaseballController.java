package controller;

import domain.action.Replay;
import domain.action.Result;
import domain.ball.BallGenerator;
import domain.ball.Balls;
import view.InputView;
import view.OutputView;

public class BaseballController {
	private static final int SEED = 1234;

	private final BallGenerator ballGenerator = new BallGenerator(SEED);
	private boolean isRunning = false;

	private boolean guess(Balls computer) {
		Balls user = new Balls(InputView.getNumbers());
		Result result = new Result(computer.countOfStrike(user), computer.countOfBall(user));
		OutputView.renderGuessResult(result);
		return result.isThreeStrike();
	}

	private void gameLoop(Balls computer) {
		while (!guess(computer));
		OutputView.renderGuessSuccess();
		isRunning = Replay.valueOf(InputView.getReplay()).isYes();
	}

	public void run() {
		isRunning = true;
		while (isRunning) {
			gameLoop(ballGenerator.generate());
		}
	}
}
