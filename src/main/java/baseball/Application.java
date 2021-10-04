package baseball;

import baseball.domain.BaseBallGame;

import static baseball.constant.GameConstant.*;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        BaseBallGame baseBallGame = new BaseBallGame();
        baseBallGame.playGame();

    }
}
