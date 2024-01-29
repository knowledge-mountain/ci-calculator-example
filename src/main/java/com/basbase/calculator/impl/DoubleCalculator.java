package com.basbase.calculator.impl;

import com.basbase.calculator.BaseCalculator;
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
public class LongCalculator extends BaseCalculator<Long> {
    public LongCalculator() {
        super((l1, l2) -> l1 + l1, (l1, l2) -> l1 - l2, (l1, l2) -> l1 * l2, (l1, l2) -> l1 / l2);
    }

    @Override
    public Long add(Long n1, Long n2) {
        return calculate(ADD, n1, n2);
    }

    @Override
    public Long sub(Long n1, Long n2) {
        return calculate(SUB, n1, n2);
    }

    @Override
    public Long mult(Long n1, Long n2) {
        return calculate(MULT, n1, n2);
    }

    @Override
    public Long div(Long n1, Long n2) {
        return calculate(DIV, n1, n2);
    }
}
