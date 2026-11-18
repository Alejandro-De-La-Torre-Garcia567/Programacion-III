package Vista;
import es.usal.progiii.tools.Esdia;
import Controlador.*;
import Modelo.Partido;
import Modelo.Quiniela;

public class Vista {

        private Controlador c;
        

        public void showMessage(String prompt){

            System.out.println(prompt);
        }


        public void initV(){

            int i;

            for(i=0;i<c.getPartidos();i++){

            System.out.println("\n--- PARTIDO " + (i + 1) + " ---");
            
            String e1=Esdia.readString("Introduzca al primer equipo: ");
            String e2=Esdia.readString("Introduzca al segundo equipo: ");
            int golesLocal = Esdia.readInt("Introduzca los goles del equipo local: ");
            int golesVisitante = Esdia.readInt("Introduzca los goles del equipo visitante: ");

                Partido p=new Partido(e1,e2,golesLocal,golesVisitante);

                c.añadirPartido(p);
            }

            System.out.println("Se han añadido los equipos correctamente");

        } 


        public void mostrarQuiniela(){
            
            Quiniela quiniela =c.getQuiniela();


            if(c.crearTabla()==1){

                System.out.println("Tabla creada correctamente");
                System.out.println(quiniela.obtenerTablaQuiniela());

            }else

                System.out.println("No hay suficientes partidos para crear la quiniela");

        }
        

        public void setControlador(Controlador c){

            this.c=c;

        }

    }

