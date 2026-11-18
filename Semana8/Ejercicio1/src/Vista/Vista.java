package Vista;
import es.usal.progiii.tools.Esdia;
import Controlador.*;

public class Vista {

        private Controlador c;


        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public void initV(){

            int i;

            for(i=0;i<c.getPartidos();i++){

                


            }



        } 


        public void mostrarQuiniela(String tabla){

            System.out.println(tabla);
        }
        

        public void setControlador(Controlador c){

            this.c=c;

        }

    }

