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

        System.out.printf("\n\nMENÚ\n\n");
        System.out.printf("1: Establecer el tamaño del registro del sistema\n");
        System.out.printf("2: Añadir un nuevo coche al sistema\n");
        System.out.printf("3: Lista de todos los vehículos en el sistema");
        System.out.printf("4: Buscar un coche específico en el sistema\n");
        System.out.printf("5: Actualizar la información de un coche específico\n");
        System.out.printf("6: Eliminar un coche específico del sistema\n");
        System.out.printf("7: Salida del programa (se eliminará el registro)\n");

        System.out.printf("\nElija una opción: ");
        o=sc.nextInt();
        sc.nextLine();

        System.out.printf("\n\n\n(Antes de utilizar el resto de opciones debe crear un registro)\n\n");


        if(o==1){

            System.out.printf("\n\nIntroduzca el tamaño del registro: ");
            cn.setLista(sc.nextInt());

        }else if(o==2 && cn.getExiste()){

        c=new Coche();

        
        System.out.printf("\nIntroduzca la matrícula del vehículo: ");
        c.setMatricula(sc.nextLine());


        System.out.printf("\nIntroduzca el modelo del vehículo: ");
        c.setModelo(sc.nextLine());


        System.out.printf("\nIntroduzca el precio del vehículo: ");
        c.setPrecio(sc.nextDouble());
        sc.nextLine();


        if(c.getPrecio()==0){
            System.out.printf("No se ha añadido nada\n");
            continue;
        }

        
       cn.añadirCoche(c);
        System.out.printf("\n\nVehículo añadido correctamente");


        


        }else if(o==3 && cn.getExiste()){

        System.out.printf("\n\nVEHICULOS REGISTRADOS\n\n");
        cn.imprimirLista();


        }else if(o==4 && cn.getExiste()){

            int k;

            System.out.printf("Introduzca la matrícula del vehículo a buscar: ");
            k=cn.buscarCoche(sc.nextLine());

            if(k==-1){

                continue;

            }else

                System.out.printf("El vehículo se encuentra en la posición %d",k);

        }else if(o==5 && cn.getExiste()){

            System.out.printf("Introduzca la matrícula del vehículo a actualizar: ");
            String matricula= sc.nextLine();

            System.out.printf("Introduzca el modelo del nuevo vehículo: ");
            String modelo=sc.nextLine();

            System.out.printf("Introduzca el precio del nuevo vehículo: ");
            double precio=sc.nextDouble();
            sc.nextLine();

            System.out.printf("Introduzca la matrícula del nuevo vehículo: ");
            String matricula1=sc.nextLine();
            
            
           int i= cn.actualizarCoche(matricula,modelo,precio,matricula1);

            if(i==-1){


                continue;
            }


        }else if(o==6 && cn.getExiste()){


            System.out.printf("Introduzca la matrícula del vehículo a eliminar del sistema: ");
            int i=cn.eliminarCoche(sc.nextLine());

            if(i==-1){

                System.out.printf("No se ha encontrado el vehiculo en el sistema");
            }


        }else

        System.out.printf("\nHa elegido una opción incorrecta, vuelva a intentarlo\n\n");

        }while(o!=7);




        sc.close();
    }

}