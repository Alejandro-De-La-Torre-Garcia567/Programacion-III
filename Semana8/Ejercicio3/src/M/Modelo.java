package M;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


public class Modelo {


    List<Factura> Facturas=new ArrayList<>();


    public int importarFacturaTSV(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.tsv");
        
        try{

        List<String> facturas= Files.readAllLines(p,StandardCharsets.UTF_8);
            

            
        for(String f: facturas){

            Factura fa=Factura.StringtoInstance(f);

            if(fa!=null)
            Facturas.add(fa);

        }
        
        return 1;

        }catch(IOException e){

            return -1;
        }

 

    }



    public List<String> valorMinimoClientes(float valor){

        List<String> clientesEncontrados=new ArrayList<>();

        for(Factura factura: Facturas){

            float valorFactura=factura.getImporte() * (1-factura.getDescuento()) * (1+factura.getIva());

            if(valorFactura>valor){

                clientesEncontrados.add(factura.getNombre());

            }
        }

        return clientesEncontrados;

    }

    
    public List<Factura> getFacturas(){

        return Facturas;

    }


    private String crearFilasHTML(){

        String filas="";

        for(Factura factura: Facturas){

            filas += "<tr>";
            filas += "<td>" + factura.getConcepto() + "</td>";
            filas += "<td>" + factura.getNombre() + "</td>";
            filas += "<td>" + factura.getNif() + "</td>";
            filas += "<td>" + factura.getImporte() + "</td>";
            filas += "<td>" + factura.getFecha() + "</td>";
            filas += "</tr>\n";

        }

        return filas;

    }


    private String crearDocumentoHTML(){

        String html="<!doctype html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "  <meta charset=\"UTF-8\">\n"
                + "  <title>Facturas</title>\n"
                + "  <style>table, th, td { border: 1px solid black; border-collapse: collapse; }</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "  <h1>Facturas</h1>\n"
                + "  <table>\n"
                + "    <tr><th>Concepto</th><th>Cliente</th><th>NIF</th><th>Importe</th><th>Fecha</th></tr>\n"
                + "%%TABLA%%\n"
                + "  </table>\n"
                + "</body>\n"
                + "</html>\n";

        return html.replace("%%TABLA%%", crearFilasHTML());

    }


    public int exportarHTML(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.html");

        try{

            Files.write(p, crearDocumentoHTML().getBytes(StandardCharsets.UTF_8));
            return 1;

        }catch(IOException e){

            return -1;

        }

    }



    public int exportarCSV(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.tsv");
        Path p1=Paths.get(System.getProperty("user.home"),"Desktop", "facturas.csv");

        List<String> csv= new ArrayList<>();

        try{
        List<String>lista=Files.readAllLines(p,StandardCharsets.UTF_8);
        
            for(String linea:lista){

                
                csv.add(linea.replace("\t",","));
                
            }


        }catch(IOException e){

            return -1;
        }


        try{
        Files.write(p1,csv,StandardCharsets.UTF_8);

        return 1;

        }catch(IOException e){

            return -1;

        }
    }

}
