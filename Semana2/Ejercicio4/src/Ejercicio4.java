import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);


        System.out.printf("Introduzca su edad: ");

        int edad=sc.nextInt();

        String nombre;

        sc.nextLine();

        System.out.printf("Introduzca su nombre: ");

        nombre=sc.nextLine();


        System.out.printf("Usted tiene %d años y se llama %s", edad, nombre);


        sc.close();
    }

    
}
