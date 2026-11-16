package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class Modelo {

    List<DatosDeAlumno> alumnos=new ArrayList<>();

    public String crearAlumnos(){

        alumnos.clear();
        int i;

        for(i=0;i<20;i++){

            Direccion d=Direccion.direccionFactory();
            DatosPersonales p=DatosPersonales.datosFactory();

            DatosDeAlumno a=new DatosDeAlumno(d,p);
            alumnos.add(a);
        }

        return "Lista de alumnos creada correctamente";

    }


    public String mostrarTabla(){

        String cabecera=String.format("%-12s %-22s %-4s %-9s %-23s %-3s %-4s %-3s\n--------------------------------------------------------------------------------------------\n","NOMBRE","APELLIDOS","EDAD","NIF","CALLE","NUMERO","PISO","LETRA");

        String t=cabecera;

        int i;

        for(i=0;i<20;i++){

            t+=((alumnos.get(i).getDatos().toString()) +"  "+ (alumnos.get(i).getDireccion().toString()) )+"\n";


        }

        return t;

    }

}
