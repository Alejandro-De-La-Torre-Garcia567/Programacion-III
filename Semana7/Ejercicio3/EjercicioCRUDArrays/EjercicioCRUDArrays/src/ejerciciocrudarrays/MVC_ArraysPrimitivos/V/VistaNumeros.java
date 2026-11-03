package ejerciciocrudarrays.MVC_ArraysPrimitivos.V;

import static es.usal.progiii.tools.Esdia.*;

public class VistaNumeros {

    public void showMenu() {
        System.out.println("\n--- MENU CRUD NUMEROS ---");
        System.out.println("1. Agregar número");
        System.out.println("2. Eliminar número");
        System.out.println("3. Modificar número");
        System.out.println("4. Listar números");
        System.out.println("5. Salir");
    }

    public int getNumber() {
        return readInt("Ingrese el número: ");
    }

    public int getNewNumber() {
        return readInt("Ingrese el nuevo número: ");
    }

    public int getUserOption() {
        return readInt("Ingrese una opción: ");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
