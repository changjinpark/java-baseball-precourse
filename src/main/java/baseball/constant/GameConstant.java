package baseball.constant;

public class GameConstant {
    public static final int GAME_START = 1;
    public static final int GAME_STOP = 2;
    public static final int GAME_END = 3;
    public static final int NUMBER_LENGTH = 3;
    public static final int NUMBER_RANGE_ZERO = 0;
    public static final int NUMBER_RANGE_ONE = 1;
    public static final int NUMBER_RANGE_NINE = 9;

    public static final String INPUT_USER_BALL_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    public static final String SELECT_GAME_STATUS_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String BALL = "볼 ";
    public static final String STRIKE = "스트라이크 ";
    public static final String NOTHING = "낫싱 ";

    public static final String INPUT_LENGTH_ERROR_MESSAGE = "[ERROR] 입력 값의 길이가 3이 아닙니다.";
    public static final String INPUT_NOT_DIGIT_ERROR_MESSAGE = "[ERROR] 입력 값에 숫자가 아닌 값이 입력되었습니다.";
    public static final String INPUT_ZERO_ERROR_MESSAGE = "[ERROR] 입력 값에 0이 포함되었습니다.";
    public static final String INPUT_DUPLICATE_ERROR_MESSAGE = "[ERROR] 입력 값에 중복된 값이 입력되었습니다.";
    public static final String INPUT_INVALID_GAME_STATUS_ERROR_MESSAGE = "[ERROR] 입력값이 잘못 되었습니다. 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
}
