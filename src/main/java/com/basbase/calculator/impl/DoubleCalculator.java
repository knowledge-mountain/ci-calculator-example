package com.basbase.calculator.impl;

import static com.basbase.calculator.impl.OperationName.ADD;
import static com.basbase.calculator.impl.OperationName.DIV;
import static com.basbase.calculator.impl.OperationName.MULT;
import static com.basbase.calculator.impl.OperationName.SUB;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
public class DoubleCalculator extends BaseCalculator<Double> {
    public DoubleCalculator() {
        super(Double::sum, (l1, l2) -> l1 - l2, (l1, l2) -> l1 * l2, (l1, l2) -> l1 / l2);
    }

    @Override
    public Double add(Double n1, Double n2) {
        return calculate(ADD, n1, n2);
    }

    @Override
    public Double sub(Double n1, Double n2) {
        return calculate(SUB, n1, n2);
    }

    @Override
    public Double mult(Double n1, Double n2) {
        return calculate(MULT, n1, n2);
    }

    @Override
    public Double div(Double n1, Double n2) {
        return calculate(DIV, n1, n2);
    }
}
