package V;
import java.util.Scanner;
import C.*;
import java.util.List;
import M.Persona;

public class Vista {

    Scanner sc=new Scanner(System.in);

    Controlador c;


    public void initMenu(){


        boolean exit=false;

        while(!exit){


        System.out.printf("\n\n\tMENÚ\n\n");
        System.out.printf("1. Leer fichero TSV del escritorio\n");
        System.out.printf("2. Mostrar datos en forma tabular\n");
        System.out.printf("3. Salir del programa\n");
        System.out.printf("Introduzca una opción: ");

        int option=sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:

                readTSV();

            break;

            case 2: 

                showTable();

            break;

            case 3:

            System.out.println("Ha salido del programa");
            exit=true;
            break;

            default:

            System.out.println("Opción incorrecta");

        }

        }


    }


     public void showMessage(String l){

        System.out.println(l);
        
     }

    private void showTable(){

        List<Persona> personas=c.getPersonas();
        
        
        String tabla=Persona.cabeceraSeparador();

        int i;

        for(i=0;i<personas.size();i++){

        tabla+=personas.get(i).toString()+"\n";

    

        }

         System.out.println(tabla);

    }

    private void readTSV(){

        System.out.printf("Introduzca el nombre del archivo a cargar: ");

        String a=sc.nextLine();

        if(c.readTSV(a)==1){

            System.out.println("Se ha leído el TSV correctamente");

        }else

            System.out.println("No se ha podido leer el TSV");

    }

    public void setControlador(Controlador c){

        this.c=c;

    }

}
