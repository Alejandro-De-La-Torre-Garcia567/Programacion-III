import java.io.Console;
import java.util.Arrays;

public class ordenar{

    public static void main(String[] args){

        Console c= System.console();

        if(c==null){

            System.out.println("Error: No hay una consola disponible");
            System.exit(1);
        }

        int i;
        String[] cadenas=new String[5];

        for(i=0;i<5;i++){
        
            cadenas[i]=c.readLine("Introduzca la cadena %d: ",i+1);

        }


        Arrays.sort(cadenas);

        System.out.printf("Cadenas ordenadas alfabéticamente\n\n");

        for(i=0;i<5;i++){

            System.out.printf("cadena: %d %s\n",i+1,cadenas[i]);
        }

    }

}