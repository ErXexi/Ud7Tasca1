package es.iesmz.ed.algoritmes;

/**
 *
 */
public class SumaDescendent {
    private long num;

    /**
     *
     * @param num Número que se le pasa para realizar la función
     */
    public SumaDescendent(long num) {
        this.num = num;
    }

    /**
     * Se parsea el long a String y lo recorro en un bucle el cual con la función "SUBSTRING" recorro la funcion de i hasta el último dígito
     * @return la suma de todos los dígitos
     */
    public int suma(){
        int sum = 0;
        String parsedNum = String.valueOf(Math.abs(num));
        for (int i = 0; i < parsedNum.length(); i++) {
            sum += Integer.parseInt(parsedNum.substring(i));
        }
        return sum;
    }
}
