package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Modelo {

    List<DatosDeAlumno> alumnos=new ArrayList<>();

    public int createNewList(){

        alumnos.clear();
        int i;

        for(i=0;i<20;i++){

            Direccion d=Direccion.direccionFactory();
            DatosPersonales p=DatosPersonales.datosFactory();

            DatosDeAlumno a=new DatosDeAlumno(d,p);
            alumnos.add(a);
        }

        return 1;

    }

    public List<DatosDeAlumno> obtenerAlumnos(){

        return alumnos;

    }

    public int exportDataToCSV(){

        int i;

        Path p= Paths.get(System.getProperty("user.home"),"Desktop", "Datos.csv");

        List<String>l=new ArrayList<>();

        for(i=0;i<alumnos.size();i++){

            l.add((this.alumnos.get(i).getDatos().getCSV()));
        
        }

        try{

            Files.write(p,l,StandardCharsets.UTF_8);

            return 1;
        
        }catch(IOException e){

            return -1;
        }

    }


        public int exportDirectionsToCSV(){

        int i;

        Path p= Paths.get(System.getProperty("user.home"),"Desktop", "Direcciones.csv");

        List<String>l=new ArrayList<>();

        for(i=0;i<alumnos.size();i++){

            l.add((this.alumnos.get(i).getDireccion().getCSV()));
        
        }

        try{

            Files.write(p,l,StandardCharsets.UTF_8);

            return 1;
        
        }catch(IOException e){

            return -1;
        }

    }




}
