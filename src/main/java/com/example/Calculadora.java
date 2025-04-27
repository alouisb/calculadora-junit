package com.example;

public class Calculadora {

    public double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double dividir(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return numeroUm / numeroDois;
    }

    public double potenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
