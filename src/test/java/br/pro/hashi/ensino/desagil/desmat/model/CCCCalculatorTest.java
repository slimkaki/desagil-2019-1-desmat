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

    @Test
    public void Bário() {
        Assertions.assertEquals(3.62, calculator.calculate(137.33, 0.217), 0.000001);
    }

    @Test
    public void Cromio(){
        Assertions.assertEquals(7.18, calculator.calculate(52, 0.125),0.000001); }
    @Test
    public void Cesio(){
        Assertions.assertEquals(1.92, calculator.calculate(132.91, 0.265),0.000001);}

}
