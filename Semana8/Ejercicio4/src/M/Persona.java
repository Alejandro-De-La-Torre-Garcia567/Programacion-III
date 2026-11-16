package M;

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


        String n=tokens[0];
        String t=tokens[1];
        float p=Float.parseFloat(tokens[2]);

        Persona personita=new Persona(n,t,p);

        return personita;

    }


    


}
