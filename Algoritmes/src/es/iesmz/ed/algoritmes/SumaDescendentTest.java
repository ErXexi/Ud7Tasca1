package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {
    @Test
    public void sumaDescendents54321(){
        SumaDescendent s1 = new SumaDescendent(54321);
        int resultadoReal = s1.suma();
        int resultadoEsperado = 54321 + 4321 + 321 + 21 + 1;

        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void sumaDescendents4578(){
        SumaDescendent s1 = new SumaDescendent(4578);
        int resultadoReal = s1.suma();
        int resultadoEsperado = 4578 + 578 + 78 + 8;

        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void sumaDescendents123(){
        SumaDescendent s1 = new SumaDescendent(123);
        int resultadoReal = s1.suma();
        int resultadoEsperado = 123 + 23 + 3;

        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void sumaDescendentsNegative521(){
        SumaDescendent s1 = new SumaDescendent(-521);
        int resultadoReal = s1.suma();
        int resultadoEsperado = 521 + 21 + 1;

        assertEquals(resultadoReal, resultadoEsperado);
    }



}