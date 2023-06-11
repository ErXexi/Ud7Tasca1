package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculMentalTests {
    @Test
    public void test1587103(){
        CalculMental calculation = new CalculMental("15 + 8 - 7 + 10 - 3");
        List<Integer> resultadoReal = calculation.calculate();
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(23, 16, 26, 23));

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test163210(){
        CalculMental calculation = new CalculMental("16 + 3 + 2 - 10");
        List<Integer> resultadoReal = calculation.calculate();
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(19,21,11));

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test17125280(){
        CalculMental calculation = new CalculMental("17+12+52-80");
        List<Integer> resultadoReal = calculation.calculate();
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(29,81,1));

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test1236(){
        CalculMental calculation = new CalculMental("1+2+3-6");
        List<Integer> resultadoReal = calculation.calculate();
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(3,6,0));

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test0123(){
        CalculMental calculation = new CalculMental("0-1-2-3");
        List<Integer> resultadoReal = calculation.calculate();
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(-1, -3, -6));

        assertEquals(resultadoEsperado, resultadoReal);
    }

}
