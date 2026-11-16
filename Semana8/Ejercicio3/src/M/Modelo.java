package M;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


public class Modelo {


    List<Factura> Facturas=new ArrayList<>();
    List<String> clientes=new ArrayList<>();


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



    public String valorMinimoClientes(float valor){

        int i;
        float valorFactura;
        
        if(valor<=0){

            return "El importe no puede ser menor o igual a cero, o se ha introducido un tipo erróneo";
        }


        for(i=0;i<Facturas.size();i++){

            valorFactura=( (Facturas.get(i).getImporte()) * (1-Facturas.get(i).getDescuento()) * (1+Facturas.get(i).getIva()) );

            if(valorFactura>valor){

                this.clientes.add(Facturas.get(i).getNombre());

            }
        }

        return "Listado creado correctamente";

    }


    public String listaToString(){

        int i;
        String tabla="";

        for(i=0;i<clientes.size();i++){

            tabla+=this.clientes.get(i)+"\n";


        }


        return tabla;

    }


    public String listadeFacturas(){

        int i;
        String tabla="";

        for(i=0;i<Facturas.size();i++){

            tabla+=Facturas.get(i).toString()+"\n";

        }

        return tabla;
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


    public String exportarHTML(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.html");

        try{

            Files.write(p, crearDocumentoHTML().getBytes(StandardCharsets.UTF_8));
            return "HTML escrito correctamente en el escritorio";

        }catch(IOException e){

            return "Error al escribir el HTML: " + e.getMessage();

        }

    }



    public String exportarCSV(){

        Path p= Paths.get(System.getProperty("user.home"), "Desktop", "facturas.txt");
        Path p1=Paths.get(System.getProperty("user.home"),"Desktop", "facturas.csv");

        List<String> csv= new ArrayList<>();

        try{
        List<String>lista=Files.readAllLines(p,StandardCharsets.UTF_8);
        
            for(String linea:lista){

                
                csv.add(linea.replace("\t",","));
                
            }


        }catch(IOException e){

            return "Error al leer el archivo para convertir a CSV";
        }


        try{
        Files.write(p1,csv,StandardCharsets.UTF_8);

        return "CSV escrito correctamente en el escritorio";

        }catch(IOException e){

            return "Error al escribir el CSV";

        }
    }

}
