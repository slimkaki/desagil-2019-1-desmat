package br.pro.hashi.ensino.desagil.desmat.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CFCCalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CFCCalculator();
    }

    @Test
    public void testeCesio() {
        Assertions.assertEquals(1.92, calculator.calculate(40.08, 0.197), 0.000001);
    }

    @Test
    public void testeAlumnio() {
        Assertions.assertEquals(2.71, calculator.calculate(26.98,0.143), 0.000001);
    }
}
