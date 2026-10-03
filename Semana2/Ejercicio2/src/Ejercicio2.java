import java.io.Console;

public class Ejercicio2 {

    public static void main(String[] args){


           Console console=System.console();

            if(console==null){

                System.out.printf("No hay una consola disponible\n");
                return;
            }  
            
            
            int age,byear,ayear;
            String b,r;


            b=console.readLine("Ingrese su año de nacimiento: ");

            byear=Integer.parseInt(b);

            r=console.readLine("Ingrese el año actual: ");

            ayear=Integer.parseInt(r);

            
            
            if(byear>ayear){

                System.out.printf("El año de nacimiento no puede ser mayor al año actual\n");
                return;
            }

            if(byear <0 || ayear<0){

                System.out.printf("El año de nacimiento y el año actual no pueden ser negativos\n");
                return;
            }

  

            age=ayear-byear;


            System.out.printf("Su edad es: %d", age);

        }

}