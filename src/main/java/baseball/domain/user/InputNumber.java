package baseball.domain.user;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;
import static baseball.domain.user.InputValidation.*;
import static nextstep.utils.Console.readLine;

public class InputNumber {
    public static List<Integer> getUserNumber() {
        String inputNumber = readLine();
        System.out.println(inputNumber);
        validateNumberLength(inputNumber);//입력값 크기가 3 여부 판단
        validateIsOnlyDigit(inputNumber);//입력값이 숫자인지 판단
        validateZero(inputNumber);//입력값에 0이 있는지 판단
        validateNumberDuplicate(inputNumber);//입력값에 증복 값이 있는지
        return toIntegerList(inputNumber);
    }


    public static List<Integer> toIntegerList(String inputNumber) {
        List<Integer> userNumber = new ArrayList<>();
        for (char x : inputNumber.toCharArray()) {
            userNumber.add(Character.getNumericValue(x));
        }
        return userNumber;
    }
}
