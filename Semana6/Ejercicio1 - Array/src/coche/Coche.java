package coche;

public class Coche {

    private String matricula, modelo;
    private boolean estado;
    private double precio;


    public Coche(){

        this.precio=0;
        this.estado=true;
        this.modelo="No se ha fijado un modelo";
        this.matricula="No se ha fijado una matricula";

    }


    public void setMatricula(String m){

        this.matricula=m;
    }

    public String getMatricula(){

        return this.matricula;
    }

    public void setModelo (String modelo){

        this.modelo=modelo;
    }


    public String getModelo(){

        return this.modelo;
    }


    public void setPrecio(double p){


        if(p<=0){

        System.out.printf("Error: el precio debe ser mayor a cero");
        return;
        }

        this.precio=p;
    }


    public double getPrecio(){

        return this.precio;
    }


    public void setEstado(boolean e){

        this.estado=e;

    }

    public boolean getEstado(){

        return this.estado;
    }

}
