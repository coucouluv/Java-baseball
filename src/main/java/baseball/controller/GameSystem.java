package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.User;
import baseball.view.InputView;

public class GameSystem {
    private Computer computer = new Computer();
    private User user = new User();
    public void run() {
        //게임 시작 문구 출력
        InputView.startMessage();
        //게임 진행
        play();
        //컴퓨터 수 세팅
        //사용자 입력값 입력
        //게임 결과 판별
        //게임 재시작/종료 여부
    }
    public void play() {
        computer.createNumber();
        user.createNumber();
        //게임 결과는??

    }
}
