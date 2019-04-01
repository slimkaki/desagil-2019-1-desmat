package br.pro.hashi.ensino.desagil.desmat.model;

public class CCCCalculator extends Calculator {
    public CCCCalculator() {
        super("CCC");
    }

    @Override
    public double calculate(double weight, double radius) {
        double resultado;
        radius = radius*Math.pow(10,-21);
        resultado = (weight*3*Math.sqrt(3))/(19273.6*Math.pow(radius,3));
        return  resultado;
    }
}
