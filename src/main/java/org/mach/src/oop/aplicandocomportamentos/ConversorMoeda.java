package org.mach.src.oop.aplicandocomportamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorMoeda {

    private BigDecimal valorDolar;
    private BigDecimal valorConvertido;
    private final BigDecimal real = new BigDecimal("5.71");

    public void setValorDolar(double valorDolar) {
        this.valorDolar = BigDecimal.valueOf(valorDolar).setScale(2, RoundingMode.HALF_UP);

        if (valorDolar <= 0) {
            this.valorDolar = BigDecimal.ZERO;
        }
    }

    public void conversaoDolarReal() {
        valorConvertido = valorDolar.multiply(real).setScale(2, RoundingMode.HALF_UP);

        System.out.printf("%.2f dólares equivalem a %.2f reais.%n", valorDolar, valorConvertido);
    }
}