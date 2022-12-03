package baseball;

import baseball.exception.InputValidator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static baseball.exception.ErrorMessage.*;

public class InputValidatorTest {

    @Test
    @DisplayName("네자리 수를 입력했을 때 예외처리해야한다.")
    void 네자리_수_입력() {
        Assertions.assertThatThrownBy(() -> InputValidator.checkLength("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INPUT_WRONG_LENGTH.getMessage());
    }
    @Test
    @DisplayName("잘못된 타입을 입력했을 때 예외처리해야한다.")
    void 잘못된_값_입력() {
        Assertions.assertThatThrownBy(() -> InputValidator.checkType("하지먀여2"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INPUT_WRONG_TYPE.getMessage());
    }
    @Test
    @DisplayName("중복 값을 입력했을 때 예외처리해야한다.")
    void 중복_값_입력() {
        Assertions.assertThatThrownBy(() -> InputValidator.checkNumber("121"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INPUT_DUPLICATE_NUMBER.getMessage());
    }
    @Test
    @DisplayName("게임이 끝난 후 재시작/종료 이외의 값을 입력했을 때 예외처리해야한다.")
    void 게임_상태_잘못_입력() {
        Assertions.assertThatThrownBy(() -> InputValidator.checkGameStatus("121"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INPUT_WRONG_GAME_STATUS.getMessage());
    }
    @Test
    @DisplayName("잘못된 공 입력값을 예외처리해야한다.")
    void 잘못된_공_입력값_입력() {
        Assertions.assertThatThrownBy(() -> InputValidator.checkBall("121"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INPUT_DUPLICATE_NUMBER.getMessage());
    }
}
