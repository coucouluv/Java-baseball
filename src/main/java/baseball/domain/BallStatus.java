package baseball.domain;

import java.util.List;

public class BallStatus {
    private int strike;
    private int ball;
    private boolean isAllStrike;

    public BallStatus(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }
    public void gameScore(List<Integer> computer, List<Integer> user) {
        for(int i = 0; i < computer.size(); i++) {
            if(computer.get(i) == user.get(i)) {
                strike += 1;
            }
            else if(computer.contains(user.get(i))) {
                ball += 1;
            }
        }
        setIsAllStrike();
    }
    public void setIsAllStrike() {
        if(strike == 3)
            isAllStrike = true;
        else
            isAllStrike = false;
    }

    public boolean isAllStrike() {
        return isAllStrike;
    }

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }
}
