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

}
