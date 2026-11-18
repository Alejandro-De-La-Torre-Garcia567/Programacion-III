package M;
import java.util.Locale;

public class Factura {

    private String concepto,fecha,nif,nombre,direccion;
    private float descuento,iva,importe;


    private Factura(String concepto, float descuento, String fecha, float importe,String nif,String nombre, String direccion,float iva){

        this.concepto=concepto;
        this.descuento=descuento;
        this.fecha=fecha;
        this.importe=importe;
        this.nif=nif;
        this.nombre=nombre;
        this.direccion=direccion;
        this.iva=iva;


    }



    public static Factura StringtoInstance(String linea){

        String [] tokens= linea.split("\t");

        String concepto=tokens[0];
        float descuento=Float.parseFloat(tokens[1]);
        String fecha=tokens[2];
        float importe=Float.parseFloat(tokens[3]);
        String nif=tokens[4];
        String nombre=tokens[5];
        String direccion=tokens[6];
        float iva=Float.parseFloat(tokens[7]);

        Factura factura=new Factura(concepto,descuento,fecha,importe,nif,nombre,direccion,iva);

        

        return factura;
        
        


    }

    public String getConcepto(){

        return this.concepto; 

    }

    public float getDescuento(){

        return this.descuento; 

    }


    public String getFecha(){

        return this.fecha; 

    }



    public float getImporte(){

        return this.importe; 

    }




    public String getNif(){

        return this.nif; 

    }


    public String getNombre(){

        return this.nombre; 

    }




    public String getDireccion(){

        return this.direccion; 

    }

    public float getIva(){

        return this.iva; 

    }


    @Override
    public String toString(){

        return String.format(Locale.ENGLISH, "Factura: %s | CLiente: %s (NIF: %s) | Importe: %.2f | Fecha: %s | %s", concepto,nombre,nif,importe,fecha,direccion);

    }
}
