package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    @Test
    public void test5n3d() {
        DividirFactorial df = new DividirFactorial(5, 3);
        double resultadoReal = df.divideFactorials();
        double resultadoEsperado = 20;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3n5d() {
        DividirFactorial df = new DividirFactorial(3, 5);
        double resultadoReal = df.divideFactorials();
        double resultadoEsperado = 0.05;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test10n5d() {
        DividirFactorial df = new DividirFactorial(10, 5);
        double resultadoReal = df.divideFactorials();
        double resultadoEsperado = 30240;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test7n15d() {
        DividirFactorial df = new DividirFactorial(7, 15);
        double resultadoReal = df.divideFactorials();
        double resultadoEsperado = 0.00000000385f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void test0n0d() {
        DividirFactorial df = new DividirFactorial(0, 0);
        double resultadoReal = df.divideFactorials();
        double resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}