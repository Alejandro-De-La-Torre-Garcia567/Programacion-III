package M;
import java.util.Random;
import java.util.Locale;

public class DatosPersonales {


    private String nombre,apellidos,nif;
    private int edad;
    private static int contadorNif=10000000;
    private static Random random = new Random();


    private DatosPersonales(String n, String a, String nif, int e){

        this.nombre=n;
        this.apellidos=a;
        this.nif=nif;
        this.edad=e;

    }

    public static DatosPersonales datosFactory(){

        

        String []nombres={"Alejandro", "Lucía", "Carlos", "María", "Javier", "Paula", "Daniel", "Elena", "Adrián", "Sofía", "Hugo", "Marta", "Pablo", "Sara", "Álvaro", "Laura", "Diego", "Carmen", "Mario", "Alba"};
        String []apellidos={"García", "Rodríguez", "González", "Fernández", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez", "Ruiz", "Hernández", "Díaz", "Moreno", "Muñoz", "Álvarez", "Romero", "Alonso", "Gutiérrez"};

        String n=nombres[random.nextInt(nombres.length)];
        String a=apellidos[random.nextInt(apellidos.length)]+" "+apellidos[random.nextInt(apellidos.length)];

        String letras_nif="TRWAGMYFPDXBNJZSQVHLCKE";

        int e=random.nextInt((30-18)+1)+18;

        contadorNif+=random.nextInt(50000)+1;
        char letra=letras_nif.charAt(contadorNif % 23);
        String nif= String.format("%08d%c",contadorNif,letra);

        DatosPersonales d=new DatosPersonales(n,a,nif,e);


        return d;
    }


    @Override

    public String toString(){

        return String.format(Locale.ENGLISH,"%-8s %-8s %-2d %-9s",this.nombre,this.apellidos,this.edad,this.nif);

    }

    public String getNombre(){

        return this.nombre;
    }


    public String getApellidos(){

        return this.apellidos;
    }


    public String getNif(){

        return this.nif;
    }


    public int getEdad(){

        return this.edad;
    }


}
