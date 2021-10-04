package baseball.view;

import static baseball.constant.GameConstant.*;

public class PrintGameResult {
    public static void printGameResult(int strikeCount, int ballCount) {
        String message = "";
        if (strikeCount != NUMBER_RANGE_ZERO) message += (strikeCount + STRIKE);
        if (ballCount != NUMBER_RANGE_ZERO) message += (ballCount + BALL);
        if (message.length() == NUMBER_RANGE_ZERO) message += NOTHING;
        System.out.println(message);
    }
}
