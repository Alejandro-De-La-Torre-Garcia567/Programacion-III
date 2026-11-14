package Vista;
import es.usal.progiii.tools.Esdia;

public class Vista {

        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public String getUserText(){

            return Esdia.readString("Introduzca el nombre del equipo: ");
        }


        

    }

