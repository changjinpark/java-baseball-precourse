package baseball.domain.calculate;

import java.util.List;

import static baseball.constant.GameConstant.*;

public class Calculator {

    public static int calculateStrike(List<Integer> computerNumber, List<Integer> userNumber) {
        int strikeCount = 0;
        for(int i = 0 ; i < NUMBER_LENGTH ; i++) {
            strikeCount = getStrikeCount(computerNumber, userNumber, strikeCount, i);
        }
        return strikeCount;
    }

    public static int getStrikeCount(List<Integer> computerNumber, List<Integer> userNumber, int strikeCount, int i) {
        if(computerNumber.get(i).equals(userNumber.get(i))) strikeCount++;
        return strikeCount;
    }

    public static int calculateBall(List<Integer> computerNumber, List<Integer> userNumber) {
        int ballCount = 0;
        for(int i = 0 ; i < NUMBER_LENGTH ; i++) {
            ballCount = getBallCount(computerNumber, userNumber, ballCount, i);
        }
        return ballCount;
    }

    public static int getBallCount(List<Integer> computerNumber, List<Integer> userNumber, int ballCount, int i) {
        if(computerNumber.contains(userNumber.get(i)) && !computerNumber.get(i).equals(userNumber.get(i))) ballCount++;
        return ballCount;
    }
}
