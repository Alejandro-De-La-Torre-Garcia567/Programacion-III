package MVC_ArrayList.V;
import static es.usal.progiii.tools.Esdia.*;


public class VistaArrayList {



    public void showMenu(){

            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");

    }

    public String getPersonaName(){

        String nombre= readString_ne("Ingrese el nombre de la persona: ");

        return nombre;

    }


    public int getPersonaAge(){

        int edad = readInt("Ingrese la edad de la persona: ", 1, 150);
        
        return edad;
    }

    public double getPersonaHeight(){

        double altura = readDouble("Ingrese la altura de la persona (ej. 1.75): ", 0, 3);
        return altura;

    }

    public void showMessage(String prompt){

        System.out.println(prompt);
    }

    public int getUserOption(){

       return readInt("Ingrese una opción: ");

    }


    public String getPersonaNewName(){

        return readString_ne("Introduzca un nombre nuevo para la persona eligida: ");
    }


}
