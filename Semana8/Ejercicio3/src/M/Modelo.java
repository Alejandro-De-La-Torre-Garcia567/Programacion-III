package M;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.IOException;

public class Modelo {


    public void importarFacturaTSV(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.txt");
        
        try{
        List<String> facturas= Files.readAllLines(p,StandardCharsets.UTF_8);
            
    
    
        }catch(IOException e){


        }

    }


}
