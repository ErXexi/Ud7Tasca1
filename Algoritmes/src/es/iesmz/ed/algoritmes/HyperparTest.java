package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {
    @Test
    public void test1089(){
        Hyperpar hp = new Hyperpar(1089);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1289(){
        Hyperpar hp = new Hyperpar(1379);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2286(){
        Hyperpar hp = new Hyperpar(2286);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test(){
        Hyperpar hp = new Hyperpar(1089);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test00000007l(){
        Hyperpar hp = new Hyperpar(000000007L);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2864208420684204L(){
        Hyperpar hp = new Hyperpar(2864208420684204L);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testNeg2864208420684204L(){
        Hyperpar hp = new Hyperpar(-2864208420684204L);
        boolean resultadoReal = hp.isHyperPar();
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

}