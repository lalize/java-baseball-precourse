package view;

import java.util.List;
import java.util.Scanner;

import util.InputUtil;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final String GET_NUMBERS_MESSAGE = "숫자를 입력해주세요 : ";
	private static final String GET_REPLAY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static List<Integer> getNumbers() {
		System.out.print(GET_NUMBERS_MESSAGE);
		return InputUtil.stringToInts(SCANNER.nextLine());
	}

	public static int getReplay() {
		System.out.println(GET_REPLAY_MESSAGE);
		return Integer.parseInt(SCANNER.nextLine());
	}
}
