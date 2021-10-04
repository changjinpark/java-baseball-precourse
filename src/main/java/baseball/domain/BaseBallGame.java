package baseball.domain;

import java.util.List;

import static baseball.constant.GameConstant.*;
import static baseball.domain.calculate.Calculator.calculateBall;
import static baseball.domain.calculate.Calculator.calculateStrike;
import static baseball.domain.computer.NumberGenerator.getComputerNumber;
import static baseball.domain.user.InputNumber.getUserNumber;
import static baseball.domain.user.InputNumber.selectGameStatus;
import static baseball.view.PrintGameResult.printGameResult;


public class BaseBallGame {
    public int playGame() {
        List<Integer> computerNumber = getComputerNumber();//컴퓨터 숫자 생성
        int strikeCount = NUMBER_RANGE_ZERO;
        while (strikeCount != GAME_END) {
            System.out.print(INPUT_USER_BALL_MESSAGE);
            List<Integer> userNumber = getUserNumber();//user 숫자 입력
            strikeCount = judgeGame(computerNumber, userNumber);
        }
        return endGame();
    }

    private int endGame() {
        System.out.println(GAME_END_MESSAGE);
        return selectGameStatus();
    }

    private int judgeGame(List<Integer> computerNumber, List<Integer> userNumber) {
        int strikeCount = calculateStrike(computerNumber, userNumber);//Strike 수
        int ballCount = calculateBall(computerNumber, userNumber);//Ball 수
        printGameResult(strikeCount, ballCount);//결과 메세지 출력
        return strikeCount;
    }
}
