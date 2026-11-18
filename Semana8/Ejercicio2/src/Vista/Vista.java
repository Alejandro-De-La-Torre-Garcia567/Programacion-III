package Vista;
import es.usal.progiii.tools.Esdia;
import Modelo.Quiniela;
import Controlador.*;

public class Vista {

        Controlador c;


        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public int getGolesLocal(){

            return Esdia.readInt("Introduzca los goles del equipo local: ");
        } 


        public int getGolesVisitante(){

            return Esdia.readInt("Introduzca los goles del equipo vistante: ");
        }


        public void mostrarQuiniela(){

            Quiniela.obtenerTabla();
        }



        public void setControlador(Controlador c){

            this.c=c;

        }

    }

