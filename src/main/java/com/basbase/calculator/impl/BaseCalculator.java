package com.basbase.calculator.impl;

import com.basbase.calculator.Calculator;
import com.basbase.calculator.impl.OperationName;

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
public abstract class BaseCalculator<N> implements Calculator<N> {
    private final Map<OperationName, BiFunction<N, N, N>> operations;

    public BaseCalculator(BiFunction<N, N, N> add, BiFunction<N, N, N> sub, BiFunction<N, N, N> mult, BiFunction<N, N, N> div) {
        operations = Map.of(ADD, add, SUB, sub, MULT, mult, DIV, div);
    }

    protected N calculate(OperationName name, N n1, N n2) {
        return operations.get(name).apply(n1, n2);
    }
}
