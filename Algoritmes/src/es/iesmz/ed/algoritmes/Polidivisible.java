package es.iesmz.ed.algoritmes;

/**
 * Clase Polidivisible que verifica si un número es polidivisible.
 */
public class Polidivisible {
    private long num;

    /**
     * Constructor de la clase Polidivisible.
     *
     * @param num El número a verificar.
     */
    public Polidivisible(long num) {
        this.num = num;
    }

    /**
     * Verifica si el número es polidivisible.
     *
     * @return true si el número es polidivisible, false de lo contrario.
     */
    public boolean isPolidivisible() {
        String parsedNum = String.valueOf(num);
        for (int i = parsedNum.length(); i > 0; i--) {
            if (Integer.parseInt(parsedNum.substring(0, i)) % i != 0) {
                return false;
            }
        }
        return true;
    }
}
