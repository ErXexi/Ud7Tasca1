package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long num;

    public Hyperpar(long num) {
        this.num = num;
    }

    public boolean isHyperPar(){
        String numString = String.valueOf(num);
        if(numString.charAt(0) == 45){
            numString= numString.replace("-", "");
        }
        for (int i = 0; i < numString.length(); i++) {
            if(numString.charAt(i) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
