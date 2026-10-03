import es.usal.progiii.tools.Esdia;


public class Ejercicio3{

    public static void main(String[] args){

        int n=Esdia.readInt("Introduce la cantidad de números que quieres introducir para hacer la media: ");

        while(n<=0){

            System.err.printf("El número introducido no es válido, debe ser mayor que 0.\n");
            n=Esdia.readInt("El número debe ser mayor que 0: ");


        }

        System.out.printf("Introduce los numeros para calcular la media \n");

        double media=0;
        double suma=0;

        for(int i=0;i<n;i++){

            suma+=Esdia.readDouble("Introduce el número "+(i+1)+": ");
        }

        media=suma/(double)n;
        System.out.printf("La media es: %.2f\n", media);
    }

}