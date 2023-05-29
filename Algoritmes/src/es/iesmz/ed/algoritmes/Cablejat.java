package es.iesmz.ed.algoritmes;

import java.util.List;

/**
 * Clase Cablejat que verifica si es posible realizar una conexión de cables.
 */
public class Cablejat {
    private List<String> wires;
    int contH;
    int contM;

    /**
     * Constructor de la clase Cablejat.
     *
     * @param wire La lista de cables a verificar.
     */
    public Cablejat(List<String> wire) {
        this.wires = wire;
    }

    /**
     * Verifica si es posible realizar la conexión de cables.
     *
     * @return true si es posible realizar la conexión, false de lo contrario.
     */
    public boolean esPotConnectar() {
        countWires();
        return contM == contH;
    }

    /**
     * Cuenta la cantidad de cables masculinos y femeninos en la lista de cables.
     */
    public void countWires() {
        contM = 0;
        contH = 0;
        for (int i = 0; i < wires.size(); i++) {
            if (wires.get(i).charAt(0) == 'm' || wires.get(i).charAt(0) == 'M' || wires.get(i).charAt(1) == 'm' || wires.get(i).charAt(1) == 'M') {
                contM++;
            }
            if (wires.get(i).charAt(0) == 'h' || wires.get(i).charAt(0) == 'H' | wires.get(i).charAt(1) == 'h' || wires.get(i).charAt(1) == 'H') {
                contH++;
            }
        }
    }
}
