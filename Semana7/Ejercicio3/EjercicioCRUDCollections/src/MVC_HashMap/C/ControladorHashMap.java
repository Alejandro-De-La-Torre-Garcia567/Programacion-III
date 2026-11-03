package MVC_HashMap.C;
import MVC_HashMap.V.*;
import MVC_HashMap.M.*;

public class ControladorHashMap {

        public void run(ModeloHashMap modelo, VistaHashMap vista){
        int opcion;

        do {
            vista.showMenu();
            opcion = vista.getUserOption();
            
            switch (opcion) {
                case 1:

                    String dni=vista.getPersonaDni();
                    String nombre=vista.getPersonaName();
                    int edad=vista.getPersonaAge();
                    double altura=vista.getPersonaHeight();
                    modelo.agregarPersona(dni,nombre,edad,altura);

                    vista.showMessage("Persona añadida correctamente");
                    break;

                case 2:

                    dni=vista.getPersonaDni();

                    if(false==modelo.eliminarPersona(dni)){

                        vista.showMessage("No se ha encontrado a una persona con ese DNI");
                        break;
                    }

                    vista.showMessage("Persona eliminada correctamente");

                    break;

                case 3:

                    dni=vista.getPersonaDni();
                    nombre=vista.getPersonaName();
                    edad=vista.getPersonaAge();
                    altura=vista.getPersonaHeight();
                    
                    if (!modelo.modificarPersona(dni, nombre, edad, altura)) {

                        vista.showMessage("No se ha encontrado a ninguna persona con ese DNI");
                    } else {
                        vista.showMessage("Persona modificada correctamente");
                    }

                    break;

                case 4:

                    vista.showMessage(modelo.listarPersonas());

                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }


}
