package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {

    @Test
    public void cablejatHM(){
        List<String> wireComb = new ArrayList<>();
        wireComb.add("HM");
        Cablejat c1 = new Cablejat(wireComb);

        boolean resultadoReal = c1.esPotConnectar();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void cablejatHH(){
        List<String> wireComb = new ArrayList<>();
        wireComb.add("HH");
        Cablejat c1 = new Cablejat(wireComb);

        boolean resultadoReal = c1.esPotConnectar();
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void cablejatHMMH(){
        List<String> wireComb = new ArrayList<>();
        wireComb.add("HM");
        wireComb.add("MH");
        Cablejat c1 = new Cablejat(wireComb);

        boolean resultadoReal = c1.esPotConnectar();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void cablejatHMHHMM(){
        List<String> wireComb = new ArrayList<>();
        wireComb.add("HM");
        wireComb.add("HH");
        wireComb.add("MM");
        Cablejat c1 = new Cablejat(wireComb);

        boolean resultadoReal = c1.esPotConnectar();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void cablejatHMHHMMMHHHHMMM(){
        List<String> wireComb = new ArrayList<>();
        wireComb.add("HM");
        wireComb.add("HH");
        wireComb.add("MM");
        wireComb.add("MH");
        wireComb.add("HH");
        wireComb.add("HM");
        wireComb.add("MM");
        Cablejat c1 = new Cablejat(wireComb);

        boolean resultadoReal = c1.esPotConnectar();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

}