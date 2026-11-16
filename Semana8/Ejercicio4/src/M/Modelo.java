package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Modelo {

    List<Persona> personas= new ArrayList<>();


    public String leerDatos(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "datos.txt");


        try{

            List<String> datos=Files.readAllLines(p,StandardCharsets.UTF_8);

            
            for(String linea: datos){

                Persona persona=Persona.personaFactory(linea);

                if(persona==null){

                    return "Ha ocurrido un error al cargar una línea del archivo";
                }

                this.personas.add(persona);


            }


            return "Se ha leído el archivo correctamente";

        }catch(IOException e){

            return "No se ha podido cargar el archivo datos.txt" + e.getMessage();

        }

    }




    public String leerArchivo(String nombre){

        Path p=Paths.get(System.getProperty("user.home"),"Desktop",nombre);
        personas.clear();


        try{

            List<String> datos=Files.readAllLines(p,StandardCharsets.UTF_8);

            for(String linea:datos){

                Persona persona=Persona.personaFactory(linea);


                if(persona==null){

                    return "Ha ocurrido un error al leer una línea";
                }

                personas.add(persona);

            }

            return "Se ha leído y cargado correctamente el archivo indicado";

        }catch(IOException e){


            return "No se ha podido leer el archivo indicado "+e.getMessage();
        }
        
    }



    public String crearTabla(){


        String tabla=Persona.cabeceraSeparador();

        int i;

        for(i=0;i<personas.size();i++){

        tabla+=personas.get(i).toString()+"\n";

        }





        return tabla;

    }

}
