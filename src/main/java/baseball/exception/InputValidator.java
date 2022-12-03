package baseball.exception;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.exception.ErrorMessage.*;

public class InputValidator {

    private static final String RESTART = "1";
    private static final String QUIT = "2";
    private static final int NUMBER_SIZE = 3;

    public static void checkLength(String input) {
        if(input.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException(INPUT_WRONG_LENGTH.getMessage());
        }
    }
    public static void checkType(String input) {
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) < '1' || input.charAt(i) > '9') {
                throw new IllegalArgumentException(INPUT_WRONG_TYPE.getMessage());
            }
        }
    }
    public static void checkNumber(String input) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            int num =input.charAt(i) - '0';
            if(set.contains(num)) {
                throw new IllegalArgumentException(INPUT_DUPLICATE_NUMBER.getMessage());
            }
            set.add(num);
        }
    }
    public static void checkGameStatus(String input) {
        List<String> gameStatus = List.of(RESTART,QUIT);
        if(!gameStatus.contains(input.strip())) {
            throw new IllegalArgumentException(INPUT_WRONG_GAME_STATUS.getMessage());
        }
    }
    public static void checkBall(String input) {
        checkLength(input);
        checkType(input);
        checkNumber(input);

    }
}
