package src.MVC_ArrayList.C;
import src.MVC_ArrayList.M.ModeloArrayList;
import src.MVC_ArrayList.V.VistaArrayList;



public class ControladorArrayList {




    public void run(ModeloArrayList modelo, VistaArrayList vista ){

    

        int opcion;

        
        do {


            switch (opcion) {
                
                
                case 1:

                    String nombre=vista.getPersonaName();
                    int edad=vista.getPersonaAge();
                    double altura=vista.getPersonaHeight();
                    modelo.agregarPersona(nombre,edad,altura);
                    break;
                
                case 2:

                
                    eliminarPersona();
                    break;
                case 3:
                    modificarPersona();
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


