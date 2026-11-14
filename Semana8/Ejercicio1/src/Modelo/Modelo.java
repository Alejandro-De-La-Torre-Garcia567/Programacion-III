package Modelo;


public class Modelo {

    
    private final int NUMERO_PARTIDOS = 15;
    private int contador=0;

    Partido [] partidos=new Partido[NUMERO_PARTIDOS];

    public int añadirPartido(String local, String visitante, int golesLocal, int golesVisitante){

        if(contador<partidos.length){

        Partido partido=new Partido(local,visitante,golesLocal,golesVisitante);
        this.contador++;
        partidos[contador]=partido;

        return 0;

        }else

            return 1;
    }

    




}
