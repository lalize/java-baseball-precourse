package view;

import java.util.List;
import java.util.Scanner;

import util.InputUtil;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final String GET_NUMBERS_MESSAGE = "숫자를 입력해주세요 : ";

	public static List<Integer> getNumbers() {
		System.out.print(GET_NUMBERS_MESSAGE);
		return InputUtil.stringToInts(SCANNER.nextLine());
	}
}
