package M;

public class Factura {

    private String concepto,fecha,nif,nombre,direccion;
    private float descuento,iva,importe;


    public Factura StringtoInstance(String linea){

        String [] tokens= linea.split("\t");

        this.concepto=tokens[0];
        this.descuento=Float.parseFloat(tokens[1]);
        this.fecha=tokens[2];
        this.importe=Float.parseFloat(tokens[3]);
        this.nif=tokens[4];
        this.nombre=tokens[5];
        this.direccion=tokens[6];
        this.iva=Float.parseFloat(tokens[7]);

        Factura factura=new Factura();

        if(factura!=null){

            return factura;
        }

        return null;

    }



}
