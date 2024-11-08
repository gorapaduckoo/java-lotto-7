package lotto.validator;

import static lotto.message.ExceptionMessage.INVALID_NUMBER_INPUT;

import lotto.exception.IllegalInputException;
import lotto.exception.IllegalRangeException;
import lotto.exception.IllegalTypeException;
import org.junit.platform.commons.util.StringUtils;

public class PurchaseAmountValidator {

    public static final String INPUT = "구입 금액";
    public static final String TYPE = "정수";
    public static final int MIN_VALUE = 1000, MAX_VALUE = 100_000;
    public static final int UNIT = 1000;

    public static int validatePurchaseAmount(String input) {
        validateBlank(input);
        int purchaseAmount = validateType(input);
        validateRange(purchaseAmount);
        validateDivisibleByUnit(purchaseAmount);
        return purchaseAmount;
    }

    private static void validateBlank(String input) {
        if (StringUtils.isBlank(input)) {
            throw new IllegalInputException();
        }
    }

    private static int validateType(String input) {
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            throw new IllegalTypeException(INPUT, TYPE);
        }
    }

    private static void validateRange(int input) {
        if (input < MIN_VALUE || input > MAX_VALUE) {
            throw new IllegalRangeException(INPUT, MIN_VALUE, MAX_VALUE);
        }
    }

    private static void validateDivisibleByUnit(int input) {
        if (input % UNIT != 0) {
            throw new IllegalArgumentException(
                    String.format(INVALID_NUMBER_INPUT.getMessage(), INPUT, UNIT)
            );
        }
    }
}
