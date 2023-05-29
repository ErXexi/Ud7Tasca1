package es.iesmz.ed.algoritmes;

/**
 * Clase SumaDescendent que realiza la suma descendente de un número.
 */
public class SumaDescendent {
    private long num;

    /**
     * Constructor de la clase SumaDescendent.
     *
     * @param num El número del cual se realizará la suma descendente.
     */
    public SumaDescendent(long num) {
        this.num = num;
    }

    /**
     * Realiza la suma descendente del número.
     *
     * @return La suma descendente del número.
     */
    public int suma() {
        int sum = 0;
        String parsedNum = String.valueOf(Math.abs(num));
        for (int i = 0; i < parsedNum.length(); i++) {
            sum += Integer.parseInt(parsedNum.substring(i));
        }
        return sum;
    }
}
