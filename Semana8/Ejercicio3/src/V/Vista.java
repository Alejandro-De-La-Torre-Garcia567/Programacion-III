package V;
import java.util.Scanner;
import java.util.List;
import M.Factura;
import C.*;


public class Vista {

    Scanner sc= new Scanner(System.in);
    Controlador c;


    public void initMenu(){

    boolean exit=false;
    int option;

    while(!exit){

        System.out.printf("\n\n\n\tMENÚ\n");
        System.out.printf("\t1.Valor mínimo de factura\n");
        System.out.printf("\t2.Listado total de facturas\n");
        System.out.printf("\t3.Exportar a archivo .html\n");
        System.out.printf("\t4.Exportar a archivo .csv\n");
        System.out.printf("\t5.Salir del programa\n");
        System.out.printf("Introduzca una opción: ");

        option=sc.nextInt();

        switch(option){

            case 1:

                minimumValue();

            break;
            case 2:

                showTable();
            break;

            case 3:

                exportToHtml();

            break;

            case 4:

                exportToCSV();

            break;

            case 5:

                System.out.println("Ha salido del programa");
                exit=true;
            break;
           default:

            System.out.println("Ha introducido una opción incorrecta");


        }

    }

    }

        private void showTable(){

        List<Factura> facturas=c.getFacturas();


        int i;
        String tabla="";

        for(i=0;i<facturas.size();i++){

        tabla+=facturas.get(i).toString()+"\n";

        }

        System.out.println(tabla);


        }


        private void minimumValue(){

        float valor;
        
        System.out.printf("Introduzca un valor mínimo para crear el listado: ");
        try{
            
            valor=sc.nextFloat();

        }catch(Exception e){
            sc.nextLine();
            System.out.println("Tipo de dato incorrecto"+e.getMessage());
            return;
        }


        if(valor<=0){

            System.out.println("El importe no puede ser menor o igual a cero");

        }else{

        c.minimumValue(valor);
            
        System.out.println("Lista de facturas con valor mínimo creado correctamente");
            }
        }


        private void exportToHtml(){

            if(c.exportToHtml()==1){

                System.out.println("Se ha exportado correctamente el archivo Html");
            
            }else

                System.out.println("Ha ocurrido un error al exportar el archivo Html");

        }


        private void exportToCSV(){

            if(c.exportToCSV()==1){

                System.out.println("Se han exportado los datos a CSV");

            }else

                System.out.println("Ha ocurrido un error al exportar a CSV");

        }


        public void setControlador(Controlador c){

            this.c=c;
        }


        public void showMessage(String p){

            System.out.println(p);
        }

}
