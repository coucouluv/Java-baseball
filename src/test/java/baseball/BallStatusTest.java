package baseball;

import baseball.domain.BallStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BallStatusTest {
    BallStatus ballStatus;
    @BeforeEach
    public void beforeEach() {
        ballStatus = new BallStatus(0,0);
    }
    @Test
    @DisplayName("게임 결과가 1스트라이크 1볼이 맞는지 확인한다.")
    public void 원스트라이크_원볼() {
        List<Integer> computer = List.of(1,2,3);
        List<Integer> user = List.of(1,3,4);

        ballStatus.gameScore(computer,user);

        Assertions.assertThat(List.of(ballStatus.getBall(),ballStatus.getStrike())).isEqualTo(List.of(1,1));
    }
    @Test
    @DisplayName("게임 결과가 3스트라이크가 맞는지 확인한다.")
    public void 쓰리스트라이크() {
        List<Integer> computer = List.of(1,2,3);
        List<Integer> user = List.of(1,2,3);

        ballStatus.gameScore(computer,user);

        Assertions.assertThat(ballStatus.isAllStrike()).isEqualTo(true);
    }
}
