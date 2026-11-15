package M;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


public class Modelo {


    List<Factura> Facturas=new ArrayList<>();

    public String importarFacturaTSV(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.txt");
        
        try{

        List<String> facturas= Files.readAllLines(p,StandardCharsets.UTF_8);
            

            
        for(String f: facturas){

            this.Facturas.add(Factura.StringtoInstance(f));

        }
        
        return "Archivo TSV leído correctamente";

        }catch(IOException e){

            return "Error al leer el archivo TSV" + e.getMessage();
        }

 

    }



    public void valorMinimoClientes(float valor){

        int i;
        float valorFactura;

        for(i=0;i<Facturas.size();i++){

            valorFactura=( (Facturas.get(i).getImporte()) * (1-Facturas.get(i).getDescuento()) * (1+Facturas.get(i).getIva()) );

            if(valorFactura>valor){




            }
        }

    }


}
