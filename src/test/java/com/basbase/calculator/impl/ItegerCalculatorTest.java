package com.basbase.calculator.impl;

import com.basbase.calculator.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
class ItegerCalculatorTest {

    private final Calculator<Integer> integerCalculator = new IntegerCalculator();

    private static Stream<Arguments> getAddOperands() {
        return Stream.of(
                arguments(6, 10, 16, -4, 60, 6 / 10),
                arguments(5, 6, 11, -1, 30, 5 / 6),
                arguments(60, 13, 73, 47, 780, 60 / 13)
        );
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void addOperation_theResultShouldExists(Integer d1, Integer d2) {
        assertNotNull(integerCalculator.add(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void addOperation_theResultShouldEqualsToExpectedArgValue(Integer d1, Integer d2, Integer expected) {
        assertEquals(expected, integerCalculator.add(d1, d2));
    }


    @ParameterizedTest
    @MethodSource("getAddOperands")
    void subtractionOperation_theResultShouldExists(Integer d1, Integer d2) {
        assertNotNull(integerCalculator.sub(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void subtractionOperation_theResultShouldEqualsToExpectedArgValue(Integer d1, Integer d2, Integer ignore, Integer expected) {
        assertEquals(expected, integerCalculator.sub(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void multiplicationOperation_theResultShouldExists(Integer d1, Integer d2) {
        assertNotNull(integerCalculator.mult(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void multiplicationOperation_theResultShouldEqualsToExpectedArgValue(Integer d1, Integer d2, Integer ignore, Integer ignore2, Integer expected) {
        assertEquals(expected, integerCalculator.mult(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void dividingOperation_theResultShouldExists(Integer d1, Integer d2) {
        assertNotNull(integerCalculator.div(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void dividingOperation_theResultShouldEqualsToExpectedArgValue(Integer d1, Integer d2, Integer ignore, Integer ignore2, Integer ignore3, Integer expected) {
        assertEquals(expected, integerCalculator.div(d1, d2));
    }
}