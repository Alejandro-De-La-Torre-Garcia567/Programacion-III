package Vista;
import es.usal.progiii.tools.Esdia;

public class Vista {

        public void showMessage(String prompt){

            System.out.println(prompt);
        }

        public String getVisitante(){

            return Esdia.readString("Introduce el equipo loca: ");
        }

        public String getLocal(){

            return Esdia.readString("Introduzca el equipo visitante: ");

        }

        public int getGolesLocal(){

            return Esdia.readInt("Introduzca los goles del equipo local");
        } 


        public int getGolesVisitante(){

            return Esdia.readInt("Introduzca los goles del equipo vistante: ");
        }

    }

