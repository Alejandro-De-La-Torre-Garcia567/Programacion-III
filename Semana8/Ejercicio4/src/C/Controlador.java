package C;
import M.*;
import V.*;
import java.util.List;

public class Controlador {

    private Modelo m;
    private Vista v;


    public Controlador(Modelo m, Vista v){

        this.v=v;
        this.m=m;

        this.v.setControlador(this);

    }

        public void init(){

            initialTSV();
            v.initMenu();

        }

        public int readTSV(String a){

            return m.readTSV(a);
        }


        public List<Persona> getPersonas(){

            return m.getPersonas();
        }


        public void initialTSV(){

            if(m.leerDatos()==1){

                v.showMessage("Se han cargado los datos correctamente");
            
            }else

                v.showMessage("Ha ocurrido un error al cargar los datos");
        }


    }


