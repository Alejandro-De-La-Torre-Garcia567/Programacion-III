package V;
import java.util.Scanner;
import C.*;
import java.util.List;
import M.DatosDeAlumno;

public class Vista {

    Scanner sc=new Scanner(System.in);
    Controlador c;



    public void showMessage(String prompt){

        System.out.println(prompt);
    }


    public void initMenu(){

        boolean exit=false;

        while(!exit){

        System.out.println("MENU");
        System.out.println("1.Volver a crear la lista de alumnos");
        System.out.println("2.Mostrar tabla de alumnos");
        System.out.println("3.Exportar datos personales (CSV)");
        System.out.println("4.Exportar direcciones (CSV)");
        System.out.println("q.Salir");

            String option=sc.nextLine();

            switch(option){

                case "1":

                    createNewList();

                break;

                case"2":

                    showTable();

                break;

                case"3":

                    c.exportDataToCSV();

                break;


                case"4":

                    c.exportDirectionsToCSV();

                break;

                default:
                    System.out.println("Opción no válida");

            }



        }


    }


        private void createNewList(){

                if(c.createNewList()==1){

                    System.out.println("Se ha creado una nueva lista correctamente");


                }else

                    System.out.println("No se ha podido crear una nueva lista");
            }






        private void showTable(){


        List<DatosDeAlumno>libros=c.obtenerAlumnos();
        String cabecera=String.format("%-12s %-22s %-4s %-9s %-23s %-3s %-4s %-3s\n--------------------------------------------------------------------------------------------\n","NOMBRE","APELLIDOS","EDAD","NIF","CALLE","NUMERO","PISO","LETRA");

        String t=cabecera;
        int i;

        for(i=0;i<20;i++){

            t+=((libros.get(i).getDatos().toString()) +"  "+ (libros.get(i).getDireccion().toString()) )+"\n";


        }

        System.out.println(t);

        }



        public void setControlador(Controlador c){

            this.c=c;
        }

}
