package utilidades;


public class Animal {

    private String nombre,especie;
    private float peso, consumo;
    private Cuidador cuidador;



    public Animal(){

        this.cuidador= new Cuidador();

    }

    public void setNombre(String n){

    this.nombre=n;

    }

    


    public void setEspecie(String n){

    this.especie=n;

    }



    public void setPeso(float p){

    this.peso=p;

    }


    public void setConsumo(float c){

    this.consumo=c;

    }


    public void setNombreC(String n){

        this.cuidador.setNombre(n);

    }


    public void setApellidos(String a){

        this.cuidador.setApellidos(a);
    }


    public void setFormacion(boolean t){

        this.cuidador.setFormacion(t);
    }

}



