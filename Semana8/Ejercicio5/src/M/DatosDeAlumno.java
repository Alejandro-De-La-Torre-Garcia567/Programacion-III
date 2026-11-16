package M;

public class DatosDeAlumno {

    private Direccion d;
    private DatosPersonales dp;


    public DatosDeAlumno(Direccion d, DatosPersonales dp){

        this.d=d;
        this.dp=dp;

    }   



    public Direccion getDireccion(){

        return this.d;
    }


    public DatosPersonales getDatos(){

        return this.dp;
    }


}
