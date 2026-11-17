package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

    public List<DatosDeAlumno> obtenerAlumnos(){

        return alumnos;

    }

    public String exportarDatosCSV(){

        int i;

        Path p= Paths.get(System.getProperty("user.home"),"Desktop", "Datos.csv");

        List<String>l=new ArrayList<>();

        for(i=0;i<alumnos.size();i++){

            l.add((this.alumnos.get(i).getDatos().getCSV()));
        
        }

        try{

            Files.write(p,l,StandardCharsets.UTF_8);

            return "Se han exportado los alumnos a CSV correctamente";
        
        }catch(IOException e){

            return "No ha sido posible crear o añadir al archivo CSV "+e.getMessage();
        }

    }


        public String exportarDireccionesCSV(){

        int i;

        Path p= Paths.get(System.getProperty("user.home"),"Desktop", "Direcciones.csv");

        List<String>l=new ArrayList<>();

        for(i=0;i<alumnos.size();i++){

            l.add((this.alumnos.get(i).getDireccion().getCSV()));
        
        }

        try{

            Files.write(p,l,StandardCharsets.UTF_8);

            return "Se han exportado las direcciones a CSV correctamente";
        
        }catch(IOException e){

            return "No ha sido posible crear o añadir al archivo CSV "+e.getMessage();
        }

    }




}
