package baseball.domain.computer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;
import static baseball.constant.GameConstant.NUMBER_RANGE_NINE;
import static nextstep.utils.Randoms.pickNumberInRange;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {

    private  List<Integer> computerNumber;
    private int pickedNumber;

    @BeforeEach
    void setup(){
        computerNumber = new ArrayList<>();
        pickedNumber = NUMBER_RANGE_ZERO;
    }

    @Test
    @DisplayName("범위 1에서 9까지 서로 다른 임의의 세 자리 수를 생성한다.")
    void 컴퓨터숫자생성() {

        //when
        while(computerNumber.size() < NUMBER_LENGTH){
            pickedNumber = pickNumberInRange(NUMBER_RANGE_ONE, NUMBER_RANGE_NINE);
            if(!computerNumber.contains(pickedNumber)){
                computerNumber.add(pickedNumber);
            }
        }

        //then
        assertThat(computerNumber.stream().distinct().count())
                .isEqualTo(3);
    }

}
