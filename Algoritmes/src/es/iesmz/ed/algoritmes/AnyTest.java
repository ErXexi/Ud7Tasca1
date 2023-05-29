package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @Test
    public void test2020(){
        Any any = new Any(2020L);
        int resultadoReal = any.digitsDiferents();
        int resultadoEsperado = 2;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test123456789(){
        Any any = new Any(123456789L);
        int resultadoReal = any.digitsDiferents();
        int resultadoEsperado = 9;

        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testLongMaxValue(){
        Any any = new Any(Long.MAX_VALUE);
        int resultadoReal = any.digitsDiferents();
        int resultadoEsperado = 9;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1234567890(){
        Any any = new Any(1234567890L);
        int resultadoReal = any.digitsDiferents();
        int resultadoEsperado = 10;

        assertEquals(resultadoEsperado, resultadoReal);
    }
}