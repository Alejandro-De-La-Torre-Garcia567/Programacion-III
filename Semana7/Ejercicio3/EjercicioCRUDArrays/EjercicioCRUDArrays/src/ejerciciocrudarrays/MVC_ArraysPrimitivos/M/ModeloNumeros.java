package ejerciciocrudarrays.MVC_ArraysPrimitivos.M;

import java.util.Arrays;

public class ModeloNumeros {

    private static final int MAX_SIZE = 5;
    private int[] numeros = new int[MAX_SIZE];
    private int numCount = 0;

    public boolean agregarNumero(int numero) {
        if (numCount >= MAX_SIZE) {
            return false;
        }

        numeros[numCount++] = numero;
        return true;
    }

    public boolean eliminarNumero(int numero) {
        for (int i = 0; i < numCount; i++) {
            if (numeros[i] == numero) {
                for (int j = i; j < numCount - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }

                numCount--;
                numeros[numCount] = 0;
                return true;
            }
        }

        return false;
    }

    public boolean modificarNumero(int numero, int nuevoNumero) {
        for (int i = 0; i < numCount; i++) {
            if (numeros[i] == numero) {
                numeros[i] = nuevoNumero;
                return true;
            }
        }

        return false;
    }

    public String listarNumeros() {
        if (numCount == 0) {
            return "No hay números en el array.";
        }

        int[] numerosOrdenados = Arrays.copyOf(numeros, numCount);
        Arrays.sort(numerosOrdenados);
        return "Números: " + Arrays.toString(numerosOrdenados);
    }
}
