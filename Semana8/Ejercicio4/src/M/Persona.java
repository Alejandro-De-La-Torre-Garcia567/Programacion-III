package M;
import java.util.Locale;

public class Persona {


    private String nombre;
    private String telefono;
    private float peso;
    
    

    private Persona(String nombre, String telefono, float peso){

        this.nombre=nombre;
        this.telefono=telefono;
        this.peso=peso;

    }


    public static Persona personaFactory(String l){


        String[] tokens= l.split("\t");


        if(tokens.length!=3){

            return null;
        }

        try{
        String n=tokens[0];
        String t=tokens[1];
        float p=Float.parseFloat(tokens[2]);

        Persona personita=new Persona(n,t,p);
        return personita;
        }catch(Exception e){


            return null;
        }
        

    }


    public String getNombre(){

        return this.nombre;
    }


    public String getTelefono(){

        return this.telefono;
    }

    public float getPeso(){

        return this.peso;
    }

    @Override
    public String toString(){

        return String.format(Locale.ENGLISH,"%-20s %-15s %8.2f",this.nombre,this.telefono,this.peso);

    }


    public static String cabeceraSeparador(){

        return String.format("\n\n%-20s %-15s %8s\n---------------------------------------------\n","NOMBRE","TELEFONO","PESO");

    }


}
