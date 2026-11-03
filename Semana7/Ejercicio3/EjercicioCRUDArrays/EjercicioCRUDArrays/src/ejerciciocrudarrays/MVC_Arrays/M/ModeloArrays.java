package ejerciciocrudarrays.MVC_Arrays.M;

import ejerciciocrudarrays.Persona;

public class ModeloArrays {

    private static final int MAX_SIZE = 5;
    private Persona[] personas = new Persona[MAX_SIZE];
    private int personaCount = 0;

    public boolean agregarPersona(String nombre, int edad, double altura) {
        if (personaCount >= MAX_SIZE) {
            return false;
        }

        personas[personaCount++] = new Persona(nombre, edad, altura);
        return true;
    }
}
