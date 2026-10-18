package utilidades;


public class Animal {

    private String nombre,especie;
    private float peso, consumo;
    private Cuidador cuidador;



    public Animal(){

        this.cuidador= new Cuidador();
        this.peso=0;
        this.consumo=0;

    }

    public void setNombre(String n){

    this.nombre=n;

    }

    public String getEspecie(){

        return this.especie;
    }

    public String getNombre(){

        return this.nombre;
    }

    public float getConsumo(){

        return this.consumo;
    }


    public float getPeso(){

        return this.peso;
    }

    


    public void setEspecie(String n){

    this.especie=n;

    }



    public void setPeso(float p){

        if(p<=0){
            System.out.printf("Error: el peso no puede ser 0 o negativo");
            return;

        }
    this.peso=p;

    }


    public void setConsumo(float c){

        if(c<=0){
            System.out.printf("Error: el consumo no puede ser 0 o negativo");
            return;

        }



    this.consumo=c;

    }


    public void setNombreC(String n){

        this.cuidador.setNombre(n);

    }

    public String getNombreC(){

        return this.cuidador.getNombreC();

    }


    public String getApellidosC(){

        return this.cuidador.getApellidosC();

    }

    public void setApellidos(String a){

        this.cuidador.setApellidos(a);
    }


    public void setFormacion(String t){

        if (t=="s" || t=="S"){


        this.cuidador.setFormacion(true);

        }else if (t=="n" || t=="N"){

            this.cuidador.setFormacion(false);
        }else

            System.out.printf("Error: Tecla incorrecta");
            return;
    }



    public String getFormacion(){


        return this.cuidador.getFormacion();
    }

}



