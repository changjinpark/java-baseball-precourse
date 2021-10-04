package baseball.domain.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputNumberTest {

    private String inputNumber;
    private List<Integer> userNumber= new ArrayList<>();
    private List<Integer> result = new ArrayList<>();

    @BeforeEach
    void setup(){
        inputNumber = "741";
        result.add(7);
        result.add(4);
        result.add(1);
    }

    @Test
    @DisplayName("스트링 입력 값을 정수형 리스트로 변환")
    void toIntegerListTest(){
        for (char x : inputNumber.toCharArray()) {
            userNumber.add(Character.getNumericValue(x));
        }
        assertThat(userNumber).isEqualTo(result);
    }
}
