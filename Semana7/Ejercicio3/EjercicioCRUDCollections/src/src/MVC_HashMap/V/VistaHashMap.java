package src.MVC_HashMap.V;
import static es.usal.progiii.tools.Esdia.*;


public class VistaHashMap {


    public void showMenu(){
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");

        }


        public int getPersonaAge(){

            return readInt("Introduzca la edad de la persona: ");
        }


        public double getPersonaHeight(){

            return readDouble("Introduzca la altura de la persona: ");
        }

        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public int getUserOption(){

            return readInt("Introduzca una opción: ");
        }

        public String getPersonaDni(){

            return readString("Introduzca el DNI de la persona: ");
        }

        public String getPersonaName(){

            return readString("Introduzca el nombre de la persona: ");

        }





    
}
