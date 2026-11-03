package src.MVC_HashMap.C;
import src.MVC_HashMap.V.*;
import src.MVC_HashMap.M.*;

import static es.usal.progiii.tools.Esdia.readInt;

public class Controlador_HashMap {

        public void run(ModeloHashMap modelo, VistaHashMap vista){

        do {
            int opcion;
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
                    
                    if(modelo.modificarPersona(dni,nombre,edad,altura);


                    break;
                case 4:
                    listarPersonas();
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