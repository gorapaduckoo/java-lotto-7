package lotto.message;

public enum ExceptionMessage {
    INVALID_BLANK_INPUT("null 또는 빈 값은 입력할 수 없습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = "[ERROR] " + message;
    }
}