package src.MVC_HashSet.C;

import src.MVC_HashSet.M.ModeloHashSet;
import src.MVC_HashSet.V.VistaHashSet;

public class ControladorHashSet {

    public void run(ModeloHashSet modelo, VistaHashSet vista) {
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
                        vista.showMessage("Ya existe una persona con ese nombre.");
                    }
                    break;
                }
                case 2: {
                    String nombre = vista.getPersonaName();

                    if (modelo.eliminarPersona(nombre)) {
                        vista.showMessage("Persona eliminada correctamente.");
                    } else {
                        vista.showMessage("No se ha encontrado a esa persona.");
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
                        vista.showMessage("No se pudo modificar: comprueba que exista y que el nuevo nombre no esté repetido.");
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
