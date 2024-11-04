package lotto.validator;

import static lotto.message.ExceptionMessage.INVALID_BLANK_INPUT;
import static lotto.message.ExceptionMessage.INVALID_TYPE_INPUT;

import lotto.exception.IllegalInputException;
import lotto.exception.IllegalTypeException;
import org.junit.platform.commons.util.StringUtils;

public class PurchaseAmountValidator {

    private static final String input = "구입 금액";
    private static final String type = "정수";

    public static int validatePurchaseAmount(String purchaseAmount) {

        return Integer.parseInt(purchaseAmount);
    }

    private static void validateBlank(String purchaseAmount) {
        if (StringUtils.isBlank(purchaseAmount)) {
            throw new IllegalInputException(INVALID_BLANK_INPUT.getMessage());
        }
    }

    private static void validateType(String purchaseAmount) {
        try {
            Integer.parseInt(purchaseAmount);
        } catch (NumberFormatException e) {
            throw new IllegalTypeException(
                    String.format(INVALID_TYPE_INPUT.getMessage(), input, type)
            );
        }
    }


}
