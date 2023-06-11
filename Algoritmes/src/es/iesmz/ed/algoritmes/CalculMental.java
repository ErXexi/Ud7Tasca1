package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase CalculMental realiza cálculos aritméticos en base a una secuencia de caracteres.
 */
public class CalculMental {
    private String secuence;

    /**
     * Crea una nueva instancia de CalculMental con la secuencia especificada.
     *
     * @param secuence la secuencia de caracteres que representa la operación aritmética.
     */
    public CalculMental(String secuence) {
        this.secuence = secuence;
    }

    /**
     * Realiza los cálculos aritméticos en base a la secuencia de caracteres y devuelve una lista de resultados.
     *
     * @return una lista de resultados de los cálculos.
     */
    public List<Integer> calculate() {
        List<Integer> results = new ArrayList<>();
        String[] splitSecuence = secuence.split("[+-]");

        int resultado = Integer.parseInt(splitSecuence[0].trim());
        int j = 1;

        for (char operator : secuence.toCharArray()) {
            if (operator == '+') {
                resultado += Integer.parseInt(splitSecuence[j].trim());
                results.add(resultado);
                j++;
            } else if (operator == '-') {
                resultado -= Integer.parseInt(splitSecuence[j].trim());
                results.add(resultado);
                j++;
            }
        }

        return results;
    }
}

