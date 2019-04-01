package br.pro.hashi.ensino.desagil.desmat.model;

import static java.lang.Math.sqrt;

public class CFCCalculator extends Calculator {
    public CFCCalculator() {
        super("CFC");
    }

    @Override
    public double calculate(double M, double R) {

        double resultado = (M)/(2409.2 * Math.pow(R, 3) * sqrt(2));

        return resultado;
    }
}
