package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"333", "Dasha1995", "PAWEL_sie-ZLE-UCZY.2021"})
    public void shouldReturnTrueForRightUsername(String input) {
        boolean result = userValidator.validateUsername(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"m", "22", "%%%%", "%", " ", "weron^^ka"})
    public void shouldReturnFalseTrueForWrongUsername(String input) {
        boolean result = userValidator.validateUsername(input);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pawel.budych@gmail.com", "pawel1985@o2.pl", "support@kodilla.com"})
    public void shouldReturnTrueForRightEmail(String input) {
        boolean result = userValidator.validateEmail(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pawel.budych@gmail.", "pawel###budych@gmail.com", "pawel.budych@g"})
    public void shouldReturnFalseForWrongEmail(String input) {
        boolean result = userValidator.validateEmail(input);
        assertFalse(result);
    }

}

