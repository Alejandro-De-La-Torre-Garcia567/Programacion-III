package MVC_ArrayList.C;
import MVC_ArrayList.M.ModeloArrayList;
import MVC_ArrayList.V.VistaArrayList;



public class ControladorArrayList {

    public void run(ModeloArrayList modelo, VistaArrayList vista ){

    
        
        int opcion;
        
        do {

            vista.showMenu();
            opcion=vista.getUserOption();

            switch (opcion) {
                
                

                case 1:

                    String nombre=vista.getPersonaName();
                    int edad=vista.getPersonaAge();
                    double altura=vista.getPersonaHeight();
                    modelo.agregarPersona(nombre,edad,altura);

                    vista.showMessage("Persona añadida correctamente");

                    break;
                    
                
                case 2:

                    nombre=vista.getPersonaName();

                   if(modelo.eliminarPersona(nombre)==false){
                    vista.showMessage("No se ha encontrado ninguna persona con ese nombre");
                   
                    break;
                    }
                    
                    vista.showMessage("Persona eliminada correctamente");
                    break;

                case 3:
                    
                    nombre=vista.getPersonaName();
                    String nuevoNombre=vista.getPersonaNewName();
                    edad=vista.getPersonaAge();
                    altura=vista.getPersonaHeight();

                    if(modelo.modificarPersona(nombre,nuevoNombre,edad,altura)==false){

                        vista.showMessage("No se ha encontrado ninguna persona con ese nombre");
                        break;
                    }

                    vista.showMessage("Persona modificada correctamente");

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


