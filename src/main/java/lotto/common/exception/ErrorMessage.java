package lotto.common.exception;

public enum ErrorMessage {
    LOTTO_NUMBER_OUT_OF_RANGE("로또 번호는 1부터 45 사이의 숫자여야 합니다. "),
    LOTTO_SIZE_OUT_OF_RANGE("로또 번호는 6개여야 합니다. "),
    LOTTO_NUMBER_DUPLICATE("로또는 중복되지 않는 숫자로 이루어져 있어야 합니다. "),
    MONEY_OUT_OF_RANGE("돈은 1,000원 단위로 입력해야 합니다. ");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
