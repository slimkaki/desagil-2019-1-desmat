package br.pro.hashi.ensino.desagil.desmat.model;

import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class CCCCalculatorTesteCromio {
    @Test
    public void CalcularCCCUtilizandoCromioComoBase(double weight, double radius){
        CCCCalculator calculo = new CCCCalculator();
        Assertions.assertEquals(7.18,calculo.calculate(weight, radius),0.000001);
    }
}
