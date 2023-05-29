package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolidivisibleTest {

    @Test
    public void polidivisible9876(){
        Polidivisible p1 = new Polidivisible(9876);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void polidivisible381654729(){
        Polidivisible p1 = new Polidivisible(381654729);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void polidivisible102(){
        Polidivisible p1 = new Polidivisible(102);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void polidivisible137(){
        Polidivisible p1 = new Polidivisible(137);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void polidivisible258(){
        Polidivisible p1 = new Polidivisible(258);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void polidivisible42613(){
        Polidivisible p1 = new Polidivisible(42613);
        boolean resultadoReal = p1.isPolidivisible();
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }





}