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
class DoubleCalculatorTest {

    private final Calculator<Double> doubleCalculator = new DoubleCalculator();

    private static Stream<Arguments> getAddOperands() {
        return Stream.of(
                arguments(6.0, 10.0, 16.0, -4.0, 60.0, 6.0 / 10.0),
                arguments(5.0, 6.0, 11.0, -1.0, 30.0, 5.0 / 6.0),
                arguments(60.0, 13.0, 73.0, 47.0, 780.0, 60.0 / 13.0)
        );
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void addOperation_theResultShouldExists(Double d1, Double d2) {
        assertNotNull(doubleCalculator.add(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void addOperation_theResultShouldEqualsToExpectedArgValue(Double d1, Double d2, Double expected) {
        assertEquals(expected, doubleCalculator.add(d1, d2));
    }


    @ParameterizedTest
    @MethodSource("getAddOperands")
    void subtractionOperation_theResultShouldExists(Double d1, Double d2) {
        assertNotNull(doubleCalculator.sub(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void subtractionOperation_theResultShouldEqualsToExpectedArgValue(Double d1, Double d2, Double ignore, Double expected) {
        assertEquals(expected, doubleCalculator.sub(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void multiplicationOperation_theResultShouldExists(Double d1, Double d2) {
        assertNotNull(doubleCalculator.mult(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void multiplicationOperation_theResultShouldEqualsToExpectedArgValue(Double d1, Double d2, Double ignore, Double ignore2, Double expected) {
        assertEquals(expected, doubleCalculator.mult(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void dividingOperation_theResultShouldExists(Double d1, Double d2) {
        assertNotNull(doubleCalculator.div(d1, d2));
    }

    @ParameterizedTest
    @MethodSource("getAddOperands")
    void dividingOperation_theResultShouldEqualsToExpectedArgValue(Double d1, Double d2, Double ignore, Double ignore2, Double ignore3, Double expected) {
        assertEquals(expected, doubleCalculator.div(d1, d2));
    }
}