package M;
import java.util.Random;
import java.util.Locale;


public class Direccion {

    private String calle,letra;
    private int numero,piso;

    private static Random random=new Random();


    private Direccion(String calle, String letra, int numero, int piso){

        this.calle=calle;
        this.letra=letra;
        this.numero=numero;
        this.piso=piso;

    }




    public static Direccion direccionFactory(){

        String[] calles={"Calle Toro", "Calle Zamora", "Avenida de Portugal", "Paseo de Carmelitas", "Calle Rúa Mayor", "Avenida de Mirat", "Calle Gran Vía", "Calle Libreros", "Paseo de la Estación", "Avenida de Villamayor", "Calle Compañía", "Ronda del Corpus", "Calle Van Dyck", "Paseo de Canalejas", "Calle Peña Primera", "Avenida de Federico Anaya", "Calle San Pablo", "Plaza Mayor", "Calle Rector Lucena", "Calle María Auxiliadora"};
        String[] letras={"A", "B", "C", "D", "E", "F", "Izq", "Dcha"};


        String c=calles[random.nextInt(calles.length)];
        String l=letras[random.nextInt(letras.length)];

        int n=random.nextInt(120)+1;
        int p=random.nextInt(9);

        Direccion d=new Direccion(c,l,n,p);

        return d;
    }


    @Override
    public String toString(){

        return String.format(Locale.ENGLISH,"%-15s nº%-1d %-3d %-1s",this.calle,this.numero,this.piso,this.letra);


    }

    public String getCalle(){

        return this.calle;
    }

    public String getLetra(){

        return this.letra;
    }


    public int getNumero(){

        return this.numero;
    }

    public int getPiso(){

        return this.piso;
    }


}
