package src.MVC_ArrayList.C;
import src.MVC_ArrayList.M.ModeloArrayList;
import src.MVC_ArrayList.V.VistaArrayList;



public class ControladorArrayList {

    public void run(ModeloArrayList modelo, VistaArrayList vista ){

    
        vista.showMenu();
        int opcion;
        
        do {

            opcion=vista.getUserOption();

            switch (opcion) {
                
                

                case 1:

                    String nombre=vista.getPersonaName();
                    int edad=vista.getPersonaAge();
                    double altura=vista.getPersonaHeight();
                    modelo.agregarPersona(nombre,edad,altura);
                    break;
                
                case 2:

                    nombre=vista.getPersonaName();
                    modelo.eliminarPersona(nombre);
                    break;
                    
                case 3:
                    
                    nombre=vista.getPersonaName();
                    String nuevoNombre=vista.getPersonaNewName();
                    edad=vista.getPersonaAge();
                    altura=vista.getPersonaHeight();

                    modelo.modificarPersona(nombre,nuevoNombre,edad,altura);
                    break;

                case 4:
                    
                    vista.showMessage(modelo.listarPersonas());
                    break;
                case 5:

                    vista.showMessage("Saliendo del programa");
                    break;
                default:
                
                vista.showMessage("Opción no válida");
            }
        } while (opcion != 5);


    }


}


