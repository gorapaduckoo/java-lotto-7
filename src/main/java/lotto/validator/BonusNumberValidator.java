package lotto.validator;

import java.util.List;
import lotto.exception.IllegalDuplicationException;
import lotto.exception.IllegalInputException;
import lotto.exception.IllegalRangeException;
import lotto.exception.IllegalTypeException;
import org.junit.platform.commons.util.StringUtils;

public class BonusNumberValidator {

    public static final String INPUT = "보너스 번호";
    public static final String TYPE = "정수";
    public static final int MIN_VALUE = 1, MAX_VALUE = 45;

    public static int validateBonusNumber(String input, List<Integer> winningNumbers) {
        validateBlank(input);
        int bonusNumber = validateType(input);
        validateRange(bonusNumber);
        validateDuplication(bonusNumber, winningNumbers);

        return bonusNumber;
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

    private static void validateDuplication(int bonusNumber, List<Integer> numbers) {
        if (numbers.contains(bonusNumber)) {
            throw new IllegalDuplicationException(INPUT);
        }
    }
}
