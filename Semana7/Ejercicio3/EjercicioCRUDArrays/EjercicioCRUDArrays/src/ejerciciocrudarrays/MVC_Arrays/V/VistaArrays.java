package ejerciciocrudarrays.MVC_Arrays.V;

import static es.usal.progiii.tools.Esdia.*;

public class VistaArrays {

    public void showMenu() {
        System.out.println("\n--- MENU CRUD ARRAYS ---");
        System.out.println("1. Agregar persona");
        System.out.println("2. Eliminar persona");
        System.out.println("3. Modificar persona");
        System.out.println("4. Listar personas");
        System.out.println("5. Salir");
    }

    public String getPersonaName() {
        return readString_ne("Ingrese el nombre de la persona: ");
    }

    public String getPersonaNewName() {
        return readString_ne("Ingrese el nuevo nombre: ");
    }

    public int getPersonaAge() {
        return readInt("Ingrese la edad de la persona: ", 1, 150);
    }

    public double getPersonaHeight() {
        return readDouble("Ingrese la altura de la persona (ej. 1.75): ", 0, 3);
    }

    public int getUserOption() {
        return readInt("Ingrese una opción: ");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
