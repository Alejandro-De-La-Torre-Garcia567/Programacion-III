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


    public String mostrarTabla(){

        String cabecera=String.format("%-12s %-22s %-4s %-9s %-23s %-3s %-4s %-3s\n--------------------------------------------------------------------------------------------\n","NOMBRE","APELLIDOS","EDAD","NIF","CALLE","NUMERO","PISO","LETRA");

        String t=cabecera;

        int i;

        for(i=0;i<20;i++){

            t+=((alumnos.get(i).getDatos().toString()) +"  "+ (alumnos.get(i).getDireccion().toString()) )+"\n";


        }

        return t;

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
