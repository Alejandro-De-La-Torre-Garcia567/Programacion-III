package C;
import M.*;
import V.*;
import java.util.List;

public class Controlador {

    private Modelo m;
    private Vista v;



    public Controlador(Modelo m, Vista v){

        this.m=m;
        this.v=v;
    }

 
    public void initApp(){

        v.initMenu();


    }

    public List<DatosDeAlumno> obtenerAlumnos(){

        return m.obtenerAlumnos();
    }

    public int exportDirectionsToCSV(){

        return m.exportDirectionsToCSV;
    }

    public int exportDataToCSV(){

        return m.exportDataToCSV;

    }

    public int createNewList(){


        return m.createNewList;
    }


}