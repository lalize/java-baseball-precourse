package domain.action;

import java.util.Arrays;

public enum Replay {
	YES(1),
	NO(2);

	private static final String REPLAY_ERROR = "1 또는 2가 아닙니다.";

	public final int type;

	Replay(int type) {
		this.type = type;
	}

	public static Replay valueOf(int type) {
		return Arrays.stream(values())
				.filter(value -> value.type == type)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException(REPLAY_ERROR));
	}

	public boolean isYes() {
		return this == YES;
	}
}
