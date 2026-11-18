package MVC_HashMap.V;

import static es.usal.progiii.tools.Esdia.*;
import MVC_HashMap.C.ControladorHashMap;
import MVC_HashMap.M.Persona;
import java.util.Map;

public class VistaHashMap {

    private ControladorHashMap controlador;

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
        System.out.println("\n--- MENU CRUD HASHMAP ---");
        System.out.println("1. Agregar persona");
        System.out.println("2. Eliminar persona");
        System.out.println("3. Modificar persona");
        System.out.println("4. Listar personas");
        System.out.println("5. Salir");
    }

    private void agregarPersona() {
        String dni = getPersonaDni();
        String nombre = getPersonaName();
        int edad = getPersonaAge();
        double altura = getPersonaHeight();
        Persona persona = new Persona(nombre, edad, altura);

        if (controlador.agregarPersona(dni, persona)) {
            showMessage("Persona añadida correctamente.");
        } else {
            showMessage("Ya existe una persona con ese DNI o los datos no son válidos.");
        }
    }

    private void eliminarPersona() {
        String dni = getPersonaDni();

        if (controlador.eliminarPersona(dni)) {
            showMessage("Persona eliminada correctamente.");
        } else {
            showMessage("No se ha encontrado a una persona con ese DNI.");
        }
    }

    private void modificarPersona() {
        String dni = getPersonaDni();
        String nombre = getPersonaName();
        int edad = getPersonaAge();
        double altura = getPersonaHeight();
        Persona persona = new Persona(nombre, edad, altura);

        if (controlador.modificarPersona(dni, persona)) {
            showMessage("Persona modificada correctamente.");
        } else {
            showMessage("No se ha encontrado a una persona con ese DNI.");
        }
    }

    private void mostrarPersonas() {
        Map<String, Persona> personas = controlador.obtenerPersonas();

        if (personas.isEmpty()) {
            showMessage("No hay personas en el HashMap.");
            return;
        }

        System.out.printf("%-15s %-20s %-8s %-10s%n",
                "DNI", "NOMBRE", "EDAD", "ALTURA");

        for (Map.Entry<String, Persona> entrada : personas.entrySet()) {
            Persona persona = entrada.getValue();
            System.out.printf("%-15s %-20s %-8d %-10.2f%n",
                    entrada.getKey(), persona.getNombre(),
                    persona.getEdad(), persona.getAltura());
        }
    }

    public int getPersonaAge() {
        return readInt("Introduzca la edad de la persona: ");
    }

    public double getPersonaHeight() {
        return readDouble("Introduzca la altura de la persona: ");
    }

    public int getUserOption() {
        return readInt("Introduzca una opción: ");
    }

    public String getPersonaDni() {
        return readString_ne("Introduzca el DNI de la persona: ");
    }

    public String getPersonaName() {
        return readString_ne("Introduzca el nombre de la persona: ");
    }

    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public void setControlador(ControladorHashMap controlador) {
        this.controlador = controlador;
    }
}