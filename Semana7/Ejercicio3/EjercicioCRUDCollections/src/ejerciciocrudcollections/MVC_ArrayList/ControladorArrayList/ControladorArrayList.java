package ejerciciocrudcollections.MVC_ArrayList.ControladorArrayList;

public class ControladorArrayList {



        int opcion;

        do {


            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    eliminarPersona();
                    //eliminarPersonaConIterator();
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





