package baseball.domain.calculate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;
import static baseball.domain.calculate.Calculator.getBallCount;
import static baseball.domain.calculate.Calculator.getStrikeCount;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    @BeforeEach
    void beforeEach() {
        computerNumber = new ArrayList<>();
        userNumber = new ArrayList<>();
        computerNumber.add(3);
        computerNumber.add(1);
        computerNumber.add(2);
        userNumber.add(3);
        userNumber.add(2);
        userNumber.add(1);
    }

    @Test
    void 스트라이크_수() {
        int strikeCount = 0;
        for(int i = 0 ; i < NUMBER_LENGTH ; i++) {
            strikeCount = getStrikeCount(computerNumber, userNumber, strikeCount, i);
        }
        assertThat(strikeCount).isEqualTo(1);
    }

    @Test
    void 볼_수() {
        int ballCount = 0;
        for(int i = 0 ; i < NUMBER_LENGTH ; i++) {
            ballCount = getBallCount(computerNumber, userNumber, ballCount, i);
        }
        assertThat(ballCount).isEqualTo(2);
    }
}
