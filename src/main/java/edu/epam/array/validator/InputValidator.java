package edu.epam.array.validator;

import edu.epam.array.constant.Constant;

public class InputValidator {

    public boolean isNumber(String number) {
        return number.matches(Constant.NUMBER_REGEX);
    }
}
