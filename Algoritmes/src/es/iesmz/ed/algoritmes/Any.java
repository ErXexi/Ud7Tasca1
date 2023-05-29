package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

public class Any {
    private Long num;

    /**
     * Constructor de la clase Any.
     * @param num El número utilizado para realizar el cálculo.
     */
    public Any(Long num) {
        this.num = num;
    }

    /**
     * Calcula la cantidad de dígitos diferentes que contiene el número.
     * @return La cantidad de dígitos diferentes.
     */
    public int digitsDiferents(){
        String parsedNum = String.valueOf(Math.abs(num));
        List<Character> charList = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < parsedNum.length(); i++) {
            if(!charList.contains(parsedNum.charAt(i))){
                charList.add(parsedNum.charAt(i));
                cont++;
            }
        }
        return cont;
    }
}
