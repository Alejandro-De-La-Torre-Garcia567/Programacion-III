package M;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Modelo {

    List<Persona> personas= new ArrayList<>();


    public int leerDatos(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "datos.txt");


        try{

            List<String> datos=Files.readAllLines(p,StandardCharsets.UTF_8);

            
            for(String linea: datos){

                Persona persona=Persona.personaFactory(linea);

                if(persona==null){

                    return -1;
                }

                this.personas.add(persona);


            }


            return 1;

        }catch(IOException e){

            return -1;

        }

    }


    public List<Persona> getPersonas(){

        return this.personas;

    }


    public int readTSV(String nombre){

        Path p=Paths.get(System.getProperty("user.home"),"Desktop",nombre);
        personas.clear();


        try{

            List<String> datos=Files.readAllLines(p,StandardCharsets.UTF_8);

            for(String linea:datos){

                Persona persona=Persona.personaFactory(linea);


                if(persona==null){

                    return -1;
                }

                personas.add(persona);

            }

            return 1;

        }catch(IOException e){


            return -1;
        }
        
    }


}