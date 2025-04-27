package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    private Calculadora calculadora;

    @BeforeEach
    public void configurar() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar() {
        assertEquals(7.0, calculadora.somar(3.0, 4.0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1.0, calculadora.subtrair(5.0, 4.0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12.0, calculadora.multiplicar(3.0, 4.0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calculadora.dividir(5.0, 2.0));
    }

    @Test
    public void testDividirPorZero() {
        Exception erro = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10.0, 0.0);
        });
        assertEquals("Divisão por zero não é permitida.", erro.getMessage());
    }

    @Test
    public void testPotenciar() {
        assertEquals(8.0, calculadora.potenciar(2.0, 3.0));
    }
}
