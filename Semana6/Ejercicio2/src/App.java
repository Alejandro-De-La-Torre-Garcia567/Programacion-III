import java.util.Scanner;
import modelo.*;
import java.util.ArrayList;

public class App{

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);



        int opcion;

        Refugio miRefugio =new Refugio();

        do{


            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| GESTIÓN DEL REFUGIO                               |\n");
            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| 1) Añadir un nuevo animal                         |\n");
            System.out.printf("| 2) Configurar el precio del alimento por kg       |\n");
            System.out.printf("| 3) Actualizar la información de un animal         |\n");
            System.out.printf("| 4) Eliminar un animal del refugio                 |\n");
            System.out.printf("| 5) Mostrar información de los animales            |\n");
            System.out.printf("| 6) Salir (se borrará toda la información)         |\n");
            System.out.printf("|---------------------------------------------------|\n");
            
            
            
            System.out.printf("Introduzca una opción (1-5");
            opcion=sc.nextInt();    



            if(opcion==1){

                Animal a= new Animal();

                System.out.printf("Introduzca el nombre del animal: ");
                a.setNombre(sc.nextLine());

                System.out.printf("Introduzca la especie del animal: ");
                a.setEspecie(sc.nextLine());

                System.out.printf("Introduzca el peso del animal: ");
                a.setPeso(sc.nextFloat());
                sc.nextLine();

                System.out.printf("Introduzca el consumo del animal: ");
                a.setConsumo(sc.nextFloat());
                sc.nextLine();

                System.out.printf("Introduzca el nombre del cuidador: ");
                a.setNombreC(sc.nextLine());

                System.out.printf("Introduzca los apellidos del cuidador: ");
                a.setApellidos(sc.nextLine());



            miRefugio.añadirAnimal(a);
            
            
            }else if(opcion==2){


            System.out.printf("Introduzca el precio del alimento por kg (para todos los animales): ");

            miRefugio.setPrecio(sc.nextFloat());
            sc.nextLine();



            }else if(opcion==3){

                System.out.printf("Introduzca el nombre del animal a actualizar: ");
                miRefugio.actualizarAnimal(sc.nextLine());
               

            }else if (opcion==4){

                

            }else if(opcion==5){


            }else{


                System.out.printf("\n\nError: opcion incorrecta, vuelva a intentarlo\n\n\n");

           
           
           
            }
            
            }while (opcion!=5);



        }
    
    
    
    }



    

