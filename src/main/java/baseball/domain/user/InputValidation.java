package baseball.domain.user;

import java.util.*;

import static baseball.constant.GameConstant.*;

public class InputValidation {

    public static void validateNumberLength(String inputNumber) {
        if(inputNumber.length() != NUMBER_LENGTH) {
            System.out.println(INPUT_LENGTH_ERROR_MESSAGE);
        }
    }

    public static void validateIsOnlyDigit(String inputNumber) {
        try {
            Double.parseDouble(inputNumber);
        } catch(NumberFormatException e) {
            System.out.println(INPUT_NOT_DIGIT_ERROR_MESSAGE);
        }
    }

    public static void validateZero(String inputNumber) {
        if(inputNumber.contains("0")) {
            System.out.println(INPUT_ZERO_ERROR_MESSAGE);
        }
    }

    public static void validateNumberDuplicate(String inputNumber) {
        Set<Character> set = new HashSet<>();
        for(char x : inputNumber.toCharArray()){
            set.add(x);
        }
        if(set.size() != 3) {
            System.out.println(INPUT_DUPLICATE_ERROR_MESSAGE);
        }
    }
    public static void validateSelectGameStatus(int status) {
        if((status != GAME_START) && (status != GAME_STOP)) {
            System.out.println(INPUT_INVALID_GAME_STATUS_ERROR_MESSAGE);

        }
    }
}
