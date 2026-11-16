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

            
            

            return "Se ha leído el archivo correctamente";

        }catch(IOException e){

            return "No se ha podido cargar el archivo datos.txt";

        }

    }

}
