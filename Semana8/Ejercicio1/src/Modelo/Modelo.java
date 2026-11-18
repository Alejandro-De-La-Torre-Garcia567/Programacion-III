package Modelo;


public class Modelo {

    Quiniela quiniela=new Quiniela();
    private final int NUMERO_PARTIDOS = 15;
    private int contador=0;

    Partido [] partidos=new Partido[NUMERO_PARTIDOS];

    public int añadirPartido(Partido partido){

        if(contador<partidos.length){
        
        partidos[contador]=partido;
        this.contador++;
        return 0;

        }else

            return 1;
    }


    public int getNumeroPartidos(){

        return NUMERO_PARTIDOS;
    }

    public String crearTabla(){

       return quiniela.crearTabla(partidos);

    }


    public String obtenerTabla(){

        return quiniela.obtenerTablaQuiniela();
    }

    

}
