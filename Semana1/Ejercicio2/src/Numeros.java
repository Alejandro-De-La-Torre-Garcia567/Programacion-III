import java.io.Console;

public class Numeros{


    public static void main(String [] args){

        Console c= System.console();

        if(c==null){

            System.out.printf("No hay una consola disponible");
            return;
        }


        System.out.printf("Introduzca un número: ")

        int n1,n2;

        n1=(Integer.parseInt(c.readLine()));


        System.out.printf("Introduzca otro número: ")

        n2=Integer.parseInt(c.readLine());


        n1+=n2;

        System.out.printf("La suma de los números introducidos es: %d",n1);

        System.exit(0);


    }
}