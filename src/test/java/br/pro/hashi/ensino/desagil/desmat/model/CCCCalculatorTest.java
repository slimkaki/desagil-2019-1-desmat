package br.pro.hashi.ensino.desagil.desmat.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CCCCalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CCCCalculator();
    }

    @Test
    public void example() {
        Assertions.assertEquals(3.14, calculator.calculate(3, 4), 0.000001);
    }
}
