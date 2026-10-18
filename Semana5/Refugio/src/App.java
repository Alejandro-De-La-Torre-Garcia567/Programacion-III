import utilidades.*;
import java.io.Console;


public class App{

    public static void main(String [] args){

        Console c=System.console();

        if (c==null){

            System.out.printf("Error: No hay una consola disponible");
            return;

        }


        int opcion;

        Refugio miRefugio =new Refugio();

        do{


            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| GESTIÓN DEL REFUGIO                               |\n");
            System.out.printf("|---------------------------------------------------|\n");
            System.out.printf("| 1) Crear un nuevo registro de animales            |\n");
            System.out.printf("| 2) Configurar el precio del alimento por kg       |\n");
            System.out.printf("| 3) Añadir un nuevo animal al refugio              |\n");
            System.out.printf("| 4) Mostrar información de los animales            |\n");
            System.out.printf("| 5) Salir (se borrará toda la información)         |\n");
            System.out.printf("|---------------------------------------------------|\n");
            
            
            
            
            
            opcion=Integer.parseInt(c.readLine("\nSeleccione una opción (1-5): "));


            if(opcion==1){

            miRefugio.setArray(Integer.parseInt(c.readLine("Introduzca un tamaño para el nuevo registro de animales: ")));


            }else if(opcion==2){

                miRefugio.setPrecio(Float.parseFloat(c.readLine("Introduzca el precio por kilogramo: ")));


            }else if(opcion==3 && miRefugio.existeRegistro()){

                Animal animal = new Animal();
        

                animal.setNombre(c.readLine("Introduzca el nombre del animal: ")); 
                animal.setEspecie(c.readLine("Introduzca la especie del animal: "));
               


                animal.setPeso(Float.parseFloat(c.readLine("Introduzca el peso del animal: ")));
                if(animal.getPeso()==-1) continue;

                animal.setConsumo(Float.parseFloat(c.readLine("Introduzca el consumo de alimento de los animales: ")));
                if(animal.getConsumo()==-1) continue;


                animal.setNombreC(c.readLine("Introduzca el nombre del cuidador: ")); 
                animal.setApellidos(c.readLine("Introduzca los apellidos del cuidador: "));
                animal.setFormacion(c.readLine("¿El cuidador tiene Fomación? (s/n): "));
                


                miRefugio.añadirAnimal(animal);

               
               


            }else if (opcion==4 && miRefugio.existeRegistro()){

              miRefugio.mostrarAnimales();  

            }else if(opcion==5){

                System.out.printf("Ha salido del programa");
                System.exit(0);


            }else{


                System.out.printf("\n\nError: opcion incorrecta o no existe un registro para mostrar o añadir animales, vuelva a intentarlo\n\n\n");

            }



        }while (opcion!=5);



    }

}