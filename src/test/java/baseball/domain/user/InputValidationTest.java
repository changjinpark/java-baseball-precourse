package baseball.domain.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static baseball.constant.GameConstant.*;
import static org.assertj.core.api.Assertions.assertThat;

public class InputValidationTest {

    @Test
    @DisplayName("입력 값의 길이가 3이 아니면 예외처리 발생")
    void validateNumberLengthTest() {
        //given
        String errMsg = "";
        String inputNumber = "1357";

        //when
        if(inputNumber.length() != NUMBER_LENGTH) {
            errMsg = "[ERROR] 입력 값의 길이가 3이 아닙니다.";
        }

        //then
        assertThat(errMsg).isEqualTo("[ERROR] 입력 값의 길이가 3이 아닙니다.");
    }

    @Test
    @DisplayName("입력 값에 숫자가 아닌 값이 입력되면 예외처리 발생")
    void validateIsOnlyDigitTest() {
        //given
        String errMsg = "";
        String inputNumber = "a12";

        //when
        try {
            Double.parseDouble(inputNumber);
        } catch(NumberFormatException e) {
            errMsg = "[ERROR] 입력 값에 숫자가 아닌 값이 입력되었습니다.";
        }

        //then
        assertThat(errMsg).isEqualTo("[ERROR] 입력 값에 숫자가 아닌 값이 입력되었습니다.");
    }

    @Test
    @DisplayName("입력 값에 0이 포함되면 예외처리 발생")
    void validateZeroTest() {
        //given
        String errMsg = "";
        String inputNumber = "204";

        //when
        if(inputNumber.contains("0")) {
            errMsg = "[ERROR] 입력 값에 0이 포함되었습니다.";
        }

        //then
        assertThat(errMsg).isEqualTo("[ERROR] 입력 값에 0이 포함되었습니다.");
    }

    @Test
    @DisplayName("입력 값에 중복된 수가 있으면 예외처리 발생")
    void validateNumberDuplicateTest() {
        //given
        String errMsg = "";
        String inputNumber = "221";

        //when
        Set<Character> set = new HashSet<>();
        for(char x : inputNumber.toCharArray()){
            set.add(x);
        }
        if(set.size() != 3) {
            errMsg = "[ERROR] 입력 값에 중복된 값이 입력되었습니다.";
        }

        //then
        assertThat(errMsg).isEqualTo("[ERROR] 입력 값에 중복된 값이 입력되었습니다.");
    }
}
