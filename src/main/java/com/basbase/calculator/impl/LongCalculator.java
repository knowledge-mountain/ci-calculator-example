package com.basbase.calculator;

import com.basbase.calculator.op.Operation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
public class LongCalculator<N> {
    private Map<Class<N>, Operation> operations;

    public LongCalculator() {
        operations = new HashMap<>();
    }

    public N calculate(Operation op, N n1, N n2) {

    }
}
