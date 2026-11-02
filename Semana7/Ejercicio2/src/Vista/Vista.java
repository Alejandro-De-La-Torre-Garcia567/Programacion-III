package Vista;
import java.util.Scanner;


public class Vista {

    Scanner sc=new Scanner(System.in);

    public void showMenu(){

        System.out.printf("1.-Leer tabla de ventas\n2.-Leer tabla de precios\n3.-Calcular ingresos totales\n4.-Mostrar resultados\nq.-Salir");
    }

    public String getUserOption(){
        System.out.printf("\n\nIntroduzca una opción: ");
        return sc.nextLine();
    }

    public void showMessage(String m){
        System.out.printf("%s",m);
    }

    public double getUserPrecio(){

        return sc.nextDouble();
        
    }

    public int getAlmacenUnidades(){

        return sc.nextInt();
    }

    public void getAlmacenUnidadesText(String m, int i){

        System.out.printf(m,i+1);
    }

    public void showFinalResults(int i,double ingresosPorAlmacen){

        System.out.printf("Almacen %d: %.2f\n",i+1,ingresosPorAlmacen);
    
    }


    public void showTotal(double t){

        System.out.printf("\nTotal de ingresos entre todos los almacenes: %.2f", t);
    }

    public void buffer(){

        sc.nextLine();
    }

}
