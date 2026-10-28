package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    // 70kg e 1,75m -> 70 / (1.75 * 1.75) = 22.857...
    @Test
    void testarIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(70, 1.75);
        // o terceiro valor (0.01) e a margem de erro aceita para double
        assertEquals(22.86, resultado, 0.01);
    }

    // 80kg e 2,0m -> 80 / 4 = 20
    @Test
    void testarIMC2() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(80, 2.0);
        assertEquals(20.0, resultado, 0.01);
    }
}
