package org.mach.src.oop.exercicios.reaproveitandocaracteristicas;

import org.mach.src.oop.exercicios.Carro;

public class ModeloCarro extends Carro {

    private boolean tetoSolar;
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public String getTipo() {
        return tipo;
    }

    public String isTetoSolar() {
        return tetoSolar ? "Sim" : "Não";
    }
}

