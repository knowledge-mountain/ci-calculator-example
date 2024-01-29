package com.basbase.calculator;

/**
 * @author Viktor Basanets
 * @Project: ci-calculator-example
 */
public interface Calculator<N> {
    N add(N n1, N n2);

    N sub(N n1, N n2);

    N mult(N n1, N n2);

    N div(N n1, N n2);
}
