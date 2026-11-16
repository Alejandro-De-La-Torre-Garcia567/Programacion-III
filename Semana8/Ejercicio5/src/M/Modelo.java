package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class Modelo {

    List<DatosDeAlumno> alumnos=new ArrayList<>();

    public void crearAlumnos(){

        alumnos.clear();
        int i;

        for(i=0;i<20;i++){

            Direccion d=Direccion.direccionFactory();
            DatosPersonales p=DatosPersonales.datosFactory();

            DatosDeAlumno a=new DatosDeAlumno(d,p);
            alumnos.add(a);
        }

    }


    public String mostrarTabla(){

        String cabecera=String.format("%-12s %-22s %-4d %-9s %-27s nº%-3d %-4s\n--------------------\n","NOMBRE","APELLIDOS","EDAD","NIF","CALLE","NUMERO","PISO","LETRA");

        String t=cabecera;

        int i;

        for(i=0;i<20;i++){

            t+=((alumnos.get(i).getDatos().toString()) + (alumnos.get(i).getDireccion().toString()) )+"\n";


        }

        return t;



    }

}
