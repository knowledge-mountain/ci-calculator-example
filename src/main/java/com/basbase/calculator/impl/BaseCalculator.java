package com.basbase.calculator.impl;

import com.basbase.calculator.Calculator;

import java.util.Map;
import java.util.function.BiFunction;

import static com.basbase.calculator.impl.OperationName.ADD;
import static com.basbase.calculator.impl.OperationName.DIV;
import static com.basbase.calculator.impl.OperationName.MULT;
import static com.basbase.calculator.impl.OperationName.SUB;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
public abstract class BaseCalculator<N extends Number> implements Calculator<N> {
    private final Map<OperationName, BiFunction<N, N, N>> operations;

    public BaseCalculator() {
        operations = Map.of(
                ADD, (l1, l2) -> l1 + l1,
                SUB, (l1, l2) -> l1 - l2,
                MULT, (l1, l2) -> l1 * l2,
                DIV, (l1, l2) -> l1 / l2
        );
    }
}
