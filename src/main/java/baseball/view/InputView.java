package baseball.view;

import baseball.domain.BallStatus;
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
     * 매개변수: 게임 결과 관리 클래스
     */
    public static void resultMessage(BallStatus ballStatus) {
        if(ballStatus.isAllStrike()) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        else if(ballStatus.getBall() == 0 && ballStatus.getStrike() == 0) {
            System.out.println("낫싱");
        }
        else {
            System.out.println(ballStatus.getBall()+"볼 "+ ballStatus.getStrike() + "스트라이크");
        }
    }
    public static String restartOrQuitMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine(); //공백 전까지 입력받음
        InputValidator.checkGameStatus(input);
        return input;
    }

}
