package util;

import java.util.List;
import java.util.stream.Collectors;

public class InputUtil {
	public static List<Integer> stringToInts(String input) {
		return input.chars()
				.map(Character::getNumericValue)
				.boxed()
				.collect(Collectors.toList());
	}
}
