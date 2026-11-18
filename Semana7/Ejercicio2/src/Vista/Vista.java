package Vista;
import java.util.Scanner;
import Controlador.*;



public class Vista {

    Scanner sc=new Scanner(System.in);
    private static final int NUMERO_ALMACENES=5;
    private Controlador c;

    public void initMenu(){

                boolean salir = false;

        while (!salir) {
            mostrarMenu();
            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    solicitarVentas();
                    break;

                case "2":
                    solicitarPrecios();
                    break;

                case "3":
                    calcularIngresos();
                    break;

                case "4":
                    mostrarResultados();
                    break;

                case "q":
                   System.out.println("Saliendo del programa");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        
    }

    }


        private void mostrarMenu(){

        System.out.println("\nMENÚ");
        System.out.println("1. Introducir unidades vendidas");
        System.out.println("2. Introducir precios");
        System.out.println("3. Calcular ingresos");
        System.out.println("4. Mostrar resultados");
        System.out.println("q. Salir");
        System.out.print("Elige una opción: ");    

        }



        private void solicitarVentas(){

            int[] unidadesProducto1=new int[NUMERO_ALMACENES];
            int[] unidadesProducto2=new int[NUMERO_ALMACENES];


            for(int i=0;i<NUMERO_ALMACENES;i++){

                System.out.print("Unidades del producto 1 en el almacén"+ (i+1)+ ":");


                unidadesProducto1[i]=sc.nextInt();

            }

            for(int i=0;i<NUMERO_ALMACENES;i++){

                System.out.print("Unidades del producto 1 en el almacén"+ (i+1)+ ":");


                unidadesProducto2[i]=sc.nextInt();
            }


            c.registrarVentas(unidadesProducto1,unidadesProducto2);

            System.out.println("Se han registrado las ventas");
        }


        private void solicitarPrecios(){

            System.out.print("Precio globla del producto 1: ");
            double precio1= sc.nextDouble();

            System.out.print("Precio global del producto 2: ");
            double precio2= sc.nextDouble();


            c.registrarPrecios(precio1,precio2);
        }



        private void calcularIngresos(){

            if(c.calcularIngresos()){

                System.out.println("Ingresos calculados correctamente");
            
            }else

                System.out.println("Introduce las ventas y los precios");

        }



        private void mostrarResultados(){

            if(!c.hayCalculosRealizados()){

                System.out.println("Primero tienes que calcular los ingresos");
            }


            for(int i=0;i<NUMERO_ALMACENES;i++){

                System.out.printf("Ingresos del almacén %d: %.2f%n",i+1,c.getIngresosAlmacen(i));

            }

        }


        public void setControlador(Controlador c){

            this.c=c;
        }


}
