package src.MVC_HashMap.V;
import static es.usal.progiii.tools.Esdia.*;


public class Vista_HashMap {


    public void showMenu(){
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");

        }



        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public int getUserOption(){

            return readInt("Introduzca una opción: ");
        }


        public String getPersonaName(){

            return readString("Introduzca el nombre de la persona: ");

        }





    
}
