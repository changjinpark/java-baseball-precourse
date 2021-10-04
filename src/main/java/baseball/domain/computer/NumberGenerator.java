package baseball.domain.computer;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;
import static nextstep.utils.Randoms.pickNumberInRange;

public class NumberGenerator {
    public static List<Integer> getComputerNumber() {
        List<Integer> computerNumber = new ArrayList<>();
        int pickedNumber;
        while(computerNumber.size() < NUMBER_LENGTH){
            pickedNumber = pickNumberInRange(NUMBER_RANGE_ONE, NUMBER_RANGE_NINE);
            checkDuplicate(computerNumber, pickedNumber);
        }
        return computerNumber;
    }

    private static void checkDuplicate(List<Integer> computerNumber, int pickedNumber) {
        if(!computerNumber.contains(pickedNumber)){
            computerNumber.add(pickedNumber);
        }
    }
}
