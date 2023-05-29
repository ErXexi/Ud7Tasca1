package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase DividirFactorial que realiza la división de factoriales.
 */
public class DividirFactorial {
    private int numerador;
    private int denominador;
    private List<Integer> numeradorFactorial;
    private List<Integer> denominadorFactorial;
    private List<Double> resultado;

    /**
     * Constructor de la clase DividirFactorial.
     *
     * @param numerador   El numerador de la división.
     * @param denominador El denominador de la división.
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Realiza la división de los factoriales y devuelve el resultado.
     *
     * @return El resultado de la división de los factoriales.
     */
    public double divideFactorials() {
        resultado = new ArrayList<>();
        numeradorFactorial = new ArrayList<>();
        denominadorFactorial = new ArrayList<>();
        fillLists();
        double resultadoFactorial = 1;
        for (int i = 0; i < resultado.size(); i++) {
            resultadoFactorial *= resultado.get(i);
        }
        if (numerador >= denominador) {
            return resultadoFactorial;
        } else {
            return 1 / resultadoFactorial;
        }
    }

    /**
     * Llena las listas de factores de numerador y denominador.
     */
    public void fillLists() {
        for (int i = 1; i <= numerador; i++) {
            numeradorFactorial.add(i);
        }
        for (int i = 1; i <= denominador; i++) {
            denominadorFactorial.add(i);
        }
        if (denominador >= numerador) {
            resultIfDenHigher();
        } else {
            resultIfNumHigher();
        }
    }

    /**
     * Calcula el resultado cuando el numerador es mayor que el denominador.
     */
    public void resultIfNumHigher() {
        for (int i = 0; i < denominadorFactorial.size(); i++) {
            if (!numeradorFactorial.contains(denominadorFactorial.get(i))) {
                resultado.add(Double.valueOf(denominadorFactorial.get(i)));
            }
        }
        for (int i = 0; i < numeradorFactorial.size(); i++) {
            if (!denominadorFactorial.contains(numeradorFactorial.get(i)) && !resultado.contains(numeradorFactorial.get(i))) {
                resultado.add(Double.valueOf(numeradorFactorial.get(i)));
            }
        }
    }

    /**
     * Calcula el resultado cuando el denominador es mayor que el numerador.
     */
    public void resultIfDenHigher() {
        for (int i = 0; i < numeradorFactorial.size(); i++) {
            if (!denominadorFactorial.contains(numeradorFactorial.get(i))) {
                resultado.add(Double.valueOf(numeradorFactorial.get(i)));
            }
        }
        for (int i = 0; i < denominadorFactorial.size(); i++) {
            if (!numeradorFactorial.contains(denominadorFactorial.get(i)) && !resultado.contains(denominadorFactorial.get(i))) {
                resultado.add(Double.valueOf(denominadorFactorial.get(i)));
            }
        }
    }
}
