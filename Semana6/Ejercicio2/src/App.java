import java.util.Scanner;
import modelo.*;




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
            
            
            
            System.out.printf("Introduzca una opción (1-6): ");
            opcion=sc.nextInt();    
            sc.nextLine();



            if(opcion==1){

                Animal a= new Animal();

                System.out.printf("Introduzca el nombre del animal: ");
                a.setNombre(sc.nextLine());

                System.out.printf("Introduzca la especie del animal: ");
                a.setEspecie(sc.nextLine());

                System.out.printf("Introduzca el peso del animal: ");
                a.setPeso(sc.nextFloat());
                sc.nextLine();

                if(a.getPeso()==-1){

                    continue;
                }

                System.out.printf("Introduzca el consumo del animal: ");
                a.setConsumo(sc.nextFloat());
                sc.nextLine();

                if(a.getConsumo()==-1){

                    continue;
                }

                System.out.printf("Introduzca el nombre del cuidador: ");
                a.setNombreC(sc.nextLine());

                System.out.printf("Introduzca los apellidos del cuidador: ");
                a.setApellidos(sc.nextLine());

                System.out.printf("¿El cuidador tiene formación?(S/N): ");
                a.setFormacion(sc.nextLine());

            miRefugio.añadirAnimal(a);
            
            }else if(opcion==2){


            System.out.printf("Introduzca el precio del alimento por kg (para todos los animales): ");

            miRefugio.setPrecio(sc.nextFloat());
            sc.nextLine();



            }else if(opcion==3){

                System.out.printf("Introduzca el nombre del animal a actualizar: ");
                miRefugio.actualizarAnimal(sc.nextLine(), sc);
               

            }else if (opcion==4){

                System.out.println("Introduzca el nombre del animal que desea eliminar: ");
                miRefugio.eliminarAnimal(sc.nextLine());

            }else if(opcion==5){
                
                miRefugio.mostrarAnimales();


            }else{

                System.out.printf("\n\nError: opcion incorrecta, vuelva a intentarlo\n\n\n");

            }
            
            }while (opcion!=6);


             sc.close();
        }
    
    
       
    }



    

