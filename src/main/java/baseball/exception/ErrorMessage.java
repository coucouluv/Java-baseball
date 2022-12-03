package baseball.exception;

public enum ErrorMessage {
    INPUT_WRONG_LENGTH("3자리 수를 입력하세요"),
    INPUT_WRONG_TYPE("1~9까지 수를 입력하세요"),
    INPUT_DUPLICATE_NUMBER("서로 다른 수를 입력하세요"),
    INPUT_WRONG_GAME_STATUS("1(재시작)또는 2(종료)를 입력하세요");
    private final String message;
    ErrorMessage(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}
