package baseball.view;

import baseball.exception.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    //private static String input;
    public static void startMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public static String inputMessage() {
        System.out.printf("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        InputValidator.checkBall(input);
        return input;
    }

    /**
     * 여기서 매개변수 필요
     */
    public static void resultMessage(int strike, int ball) {

    }
    public static String restartOrQuitMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine(); //공백 전까지 입력받음
        return input;
    }

}
