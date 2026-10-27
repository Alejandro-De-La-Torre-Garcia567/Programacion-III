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

            System.out.println("LISTA DE TODOS LOS LIBROS EN EL SISTEMA\n\n");

            bl.mostrarLibros();



        }else if(o==3){


            System.out.printf("Introduzca el Isbn del libro a buscar: ");
            Libro t=bl.buscarLibro(sc.nextLine());
            

            if(t==null){

            System.out.printf("No se encontró ningún libro con ese isbn");
            continue;
            }

            

            System.out.printf("Título: %s\n\nGénero: %s\n\nAutor: %s\n",t.getTitulo(),t.getGenero(),t.getAutor());

   

        }else if(o==4){

            
            System.out.printf("Introduzca el Isbn del libro a actualizar: ");
            Libro t=bl.actualizarLibro(sc.nextLine());


            if(t==null){

                continue;
            }

            System.out.printf("Introduzca el título del libro: ");
            t.setTitulo(sc.nextLine());

            System.out.printf("Introduzca al autor del libro: ");
            t.setAutor(sc.nextLine());


            System.out.printf("Introduzca el género del libro: ");
            t.setGenero(sc.nextLine());


            
        }else if(o==5){

            System.out.printf("Introduzca el isbn del libro a eliminar: ");
            bl.eliminarLibro(sc.nextLine());   

        }else

            System.out.printf("Ha pulsado una opción incorrecta, vuelva a intentarlo\n\n");


        }while(o!=6);




        sc.close();
    }

}


