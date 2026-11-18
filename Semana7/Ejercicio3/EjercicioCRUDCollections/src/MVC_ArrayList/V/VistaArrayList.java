package MVC_ArrayList.V;

import static es.usal.progiii.tools.Esdia.*;
import MVC_ArrayList.C.ControladorArrayList;
import MVC_ArrayList.M.Persona;
import java.util.List;

public class VistaArrayList {

    private ControladorArrayList controlador;

    public void initMenu() {
        int opcion;

        do {
            showMenu();
            opcion = getUserOption();

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    eliminarPersona();
                    break;
                case 3:
                    modificarPersona();
                    break;
                case 4:
                    mostrarPersonas();
                    break;
                case 5:
                    showMessage("Saliendo del programa.");
                    break;
                default:
                    showMessage("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public void showMenu() {
        System.out.println("\n--- MENU CRUD ARRAYLIST ---");
        System.out.println("1. Agregar persona");
        System.out.println("2. Eliminar persona");
        System.out.println("3. Modificar persona");
        System.out.println("4. Listar personas");
        System.out.println("5. Salir");
    }

    private void agregarPersona() {
        String nombre = getPersonaName();
        int edad = getPersonaAge();
        double altura = getPersonaHeight();
        Persona persona = new Persona(nombre, edad, altura);

        if (controlador.agregarPersona(persona)) {
            showMessage("Persona añadida correctamente.");
        } else {
            showMessage("No se pudo añadir la persona.");
        }
    }

    private void eliminarPersona() {
        String nombre = getPersonaName();

        if (controlador.eliminarPersona(nombre)) {
            showMessage("Persona eliminada correctamente.");
        } else {
            showMessage("No se ha encontrado ninguna persona con ese nombre.");
        }
    }

    private void modificarPersona() {
        String nombre = getPersonaName();
        String nuevoNombre = getPersonaNewName();
        int edad = getPersonaAge();
        double altura = getPersonaHeight();

        if (controlador.modificarPersona(nombre, nuevoNombre, edad, altura)) {
            showMessage("Persona modificada correctamente.");
        } else {
            showMessage("No se ha encontrado ninguna persona con ese nombre.");
        }
    }

    private void mostrarPersonas() {
        List<Persona> personas = controlador.obtenerPersonas();

        if (personas.isEmpty()) {
            showMessage("No hay personas en el ArrayList.");
            return;
        }

        System.out.printf("%-20s %-8s %-10s%n", "NOMBRE", "EDAD", "ALTURA");
        for (Persona persona : personas) {
            System.out.printf("%-20s %-8d %-10.2f%n",
                    persona.getNombre(), persona.getEdad(), persona.getAltura());
        }
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

    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public void setControlador(ControladorArrayList controlador) {
        this.controlador = controlador;
    }
}