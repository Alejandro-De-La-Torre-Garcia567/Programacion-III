package utilidades;

public class Cuidador {


private String nombre,apellidos;
private boolean formacion;


    public void setNombre(String nombre){

        this.nombre=nombre;
    }


    public void setApellidos(String apellidos){

        this.apellidos=apellidos;
    }


    public void setFormacion(boolean t){

        this.formacion=t;

    }


    public String getFormacion(){

        if(this.formacion==true){

            return "Si";
        
        }else
            
            return "No";
    }


    public String getApellidosC(){

        return this.apellidos;
    }

    public String getNombreC(){

        return this.nombre;
    }

}



