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

            v.initMenu();

        }


        public int showTable(){

            return m.showTable();

        }

        public int readTSV(){

            return m.readTSV();
        }


        public List<Persona> getPersonas(){

            return m.getPersonas();
        }


    }


