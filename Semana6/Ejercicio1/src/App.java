import java.util.Scanner;
import coche.Coche;
import negocio.Concesionario;



public class App{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        
        int o;
        Coche c;
        Concesionario cn= new Concesionario();

        do{

        System.out.printf("MENÚ\n\n");
        System.out.printf("1: Agregar un nuevo coche al sistema\n");
        System.out.printf("2: Listar todos los coches en el sistema\n");
        System.out.printf("3: Buscar un coche específico en el sistema\n");
        System.out.printf("4: Actualizar la información de un coche específico\n");
        System.out.printf("5: Eliminar un coche específico del sistema\n");
        System.out.printf("6: Salida del programa\n");

        System.out.printf("\nElija una opción: ");
        o=sc.nextInt();
        sc.nextLine();

        if(o==1){

        c=new Coche();

        
        System.out.printf("\nIntroduzca la matrícula del vehículo: ");
        c.setMatricula(sc.nextLine());
        sc.nextLine();


        System.out.printf("\nIntroduzca el modelo del vehículo: ");
        c.setModelo(sc.nextLine());
        sc.nextLine();

        System.out.printf("\nIntroduzca el precio del vehículo: ");
        c.setPrecio(sc.nextDouble());
        sc.nextLine();

        if(c.getPrecio()==0){
            continue;
        }

        
        cn.añadirLista(c);

        System.out.printf("\n\nVehículo añadido correctamente");


        


        }else if(o==2){

        System.out.printf("\n\nVEHICULOS REGISTRADOS\n\n");
        cn.imprimirLista();


        }else if(o==3){

            int k;

            System.out.printf("Introduzca la matrícula del vehículo a buscar: ");
            k=cn.buscarCoche(sc.nextLine());

            if(k==-1){

                System.out.printf("No se ha encontrado el vehículo");
            
            }else

                System.out.printf("El vehículo se encuentra en la posición %d",k);

        }else if(o==4){

            System.out.printf("Introduzca la matrícula del vehículo a actualizar: ");
            String matricula= sc.nextLine();

            System.out.printf("Introduzca el modelo del nuevo vehículo: ");
            String modelo=sc.nextLine();

            System.out.printf("Introduzca el precio del nuevo vehículo: ");
            double precio=sc.nextDouble();

            System.out.printf("Introduzca la matrícula del nuevo vehículo: ");
            String matricula1=sc.nextLine();
            sc.nextLine();
            
            
           int i= cn.actualizarCoche(matricula,modelo,precio,matricula1);

            if(i==-1){

                System.out.println("No se ha encontrado el vehículo en el sistema");
            }


        }else if(o==5){


            System.out.printf("Introduzca la matrícula del vehículo a eliminar del sistema: ");
            int i=cn.eliminarCoche(sc.nextLine());

            if(i==-1){

                System.out.printf("No se ha encontrado el vehiculo en el sistema");
            }


        }else

        System.out.printf("\nHa elegido una opción incorrecta, vuelva a intentarlo\n\n");

        }while(o!=6);




        sc.close();
    }

}