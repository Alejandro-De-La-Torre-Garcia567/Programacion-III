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

    public boolean eliminarPersona(String nombre) {
        for (int i = 0; i < personaCount; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                for (int j = i; j < personaCount - 1; j++) {
                    personas[j] = personas[j + 1];
                }

                personaCount--;
                personas[personaCount] = null;
                return true;
            }
        }

        return false;
    }

    public boolean modificarPersona(String nombre, String nuevoNombre, int nuevaEdad, double nuevaAltura) {
        for (int i = 0; i < personaCount; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                personas[i].setNombre(nuevoNombre);
                personas[i].setEdad(nuevaEdad);
                personas[i].setAltura(nuevaAltura);
                return true;
            }
        }

        return false;
    }

    public String listarPersonas() {
        if (personaCount == 0) {
            return "No hay personas en el array.";
        }

        String resultado = "";
        for (int i = 0; i < personaCount; i++) {
            resultado += personas[i].getEstadoComoString() + "\n";
        }

        return resultado;
    }
}
