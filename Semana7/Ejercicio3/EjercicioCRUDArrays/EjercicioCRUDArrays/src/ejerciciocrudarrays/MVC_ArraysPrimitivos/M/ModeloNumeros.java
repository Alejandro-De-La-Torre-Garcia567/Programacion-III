package ejerciciocrudarrays.MVC_ArraysPrimitivos.M;

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
}
