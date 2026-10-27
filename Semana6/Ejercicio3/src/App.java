import java.util.Scanner;
import sitio.Biblioteca;
import libreria.Libro;

public class App{


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        
        int o;
        Libro l;
        Biblioteca bl= new Biblioteca();

        do{

        System.out.printf("\n\nMENÚ\n\n");
        System.out.printf("1: Agregar un nuevo libro al sistema\n");
        System.out.printf("2: Listar todos los libros en el sistema\n");
        System.out.printf("3: Buscar un libro específico en el sistema\n");
        System.out.printf("4: Actualizar la información de un libro específico\n");
        System.out.printf("5: Eliminar un libro específico del sistema\n");
        System.out.printf("6: Salida del programa\n");

        System.out.printf("\nElija una opción: ");
        o=sc.nextInt();
        sc.nextLine();


        if(o==1){


            l= new Libro();

            System.out.printf("Introduzca el título del libro: ");
            l.setTitulo(sc.nextLine());

            System.out.printf("Introduzca al autor del libro: ");
            l.setAutor(sc.nextLine());


            System.out.printf("Introduzca el género del libro: ");
            l.setGenero(sc.nextLine());

            System.out.printf("Introduzca el isbn del libro: ");
            l.setIsbn(sc.nextLine());


            bl.agregarLibro(l.getIsbn(),l);


        }else if(o==2){





        }else if(o==3){


            System.out.printf("Introduzca el Isbn del libro a buscar: ");
            sc.nextLine();

   

        }else if(o==4){

       

        }else if(o==5){



        }else

            System.out.printf("Ha pulsado una opción incorrecta, vuelva a intentarlo\n\n");


        }while(o!=6);




        sc.close();
    }

}


