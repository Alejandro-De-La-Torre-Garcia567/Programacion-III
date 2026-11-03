package ejerciciocrudarrays.MVC_Arrays.C;

import ejerciciocrudarrays.MVC_Arrays.M.ModeloArrays;
import ejerciciocrudarrays.MVC_Arrays.V.VistaArrays;

public class ControladorArrays {

    public void run(ModeloArrays modelo, VistaArrays vista) {
        int opcion;

        do {
            vista.showMenu();
            opcion = vista.getUserOption();

            switch (opcion) {
                case 1: {
                    String nombre = vista.getPersonaName();
                    int edad = vista.getPersonaAge();
                    double altura = vista.getPersonaHeight();

                    if (modelo.agregarPersona(nombre, edad, altura)) {
                        vista.showMessage("Persona añadida correctamente.");
                    } else {
                        vista.showMessage("El array de personas está lleno.");
                    }
                    break;
                }
                case 2: {
                    String nombre = vista.getPersonaName();
                    if (modelo.eliminarPersona(nombre)) {
                        vista.showMessage("Persona eliminada correctamente.");
                    } else {
                        vista.showMessage("Persona no encontrada.");
                    }
                    break;
                }
                case 3: {
                    String nombre = vista.getPersonaName();
                    String nuevoNombre = vista.getPersonaNewName();
                    int edad = vista.getPersonaAge();
                    double altura = vista.getPersonaHeight();

                    if (modelo.modificarPersona(nombre, nuevoNombre, edad, altura)) {
                        vista.showMessage("Persona modificada correctamente.");
                    } else {
                        vista.showMessage("Persona no encontrada.");
                    }
                    break;
                }
                case 4:
                    vista.showMessage(modelo.listarPersonas());
                    break;
                case 5:
                    vista.showMessage("Saliendo del programa.");
                    break;
                default:
                    vista.showMessage("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
