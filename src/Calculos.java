import java.util.ArrayList;
import java.util.List;


public class Calculos {
    private int[] numeros;

    public Calculos(int[] numeros) {
        this.numeros = numeros;
    }

    public Calculos() {
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    public double suma() {
        double sumatorio = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            sumatorio += this.numeros[i];
        }
        return sumatorio ;
    }
    public double media() {
        double sumatorio = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            sumatorio += this.numeros[i];
        }
        return sumatorio / this.numeros.length;
    }

    public int minimo() {
        int minimo = numeros[0];
        for (int i = 0; i < this.numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;

    }

    public List<Integer> repetidos() {
        List<Integer> numerosRepetidos = new ArrayList<Integer>();
        for (int i = 0; i < this.numeros.length; i++) {
            for (int j = i + 1; j < this.numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    boolean existe = numerosRepetidos.contains(numeros[i]);
                    if (existe == false) {
                        numerosRepetidos.add(numeros[i]);
                    }

                }

            }
        }
        return numerosRepetidos;
    }


}

