package com.basbase.calculator.impl;

import static com.basbase.calculator.impl.OperationName.ADD;
import static com.basbase.calculator.impl.OperationName.DIV;
import static com.basbase.calculator.impl.OperationName.MULT;
import static com.basbase.calculator.impl.OperationName.SUB;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
public class IntegerCalculator extends BaseCalculator<Integer> {
    public IntegerCalculator() {
        super(Integer::sum,
              (l1, l2) -> l1 - l2,
              (l1, l2) -> l1 * l2,
              (l1, l2) -> l1 / l2);
    }

    @Override
    public Integer add(Integer n1, Integer n2) {
        return calculate(ADD, n1, n2);
    }

    @Override
    public Integer sub(Integer n1, Integer n2) {
        return calculate(SUB, n1, n2);
    }

    @Override
    public Integer mult(Integer n1, Integer n2) {
        return calculate(MULT, n1, n2);
    }

    @Override
    public Integer div(Integer n1, Integer n2) {
        return calculate(DIV, n1, n2);
    }
}
