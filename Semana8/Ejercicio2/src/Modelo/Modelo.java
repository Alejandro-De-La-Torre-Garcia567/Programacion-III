package Modelo;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;
import java.util.List;

public class Modelo {

    private List<String> partidos;

    private Quiniela quiniela=new Quiniela();
    private final int NUMERO_PARTIDOS = 15;
    
    public int leerArchivo(){

        Path ref= Paths.get(System.getProperty("user.home"), "Desktop", "equipos.txt");

            try{

            this.partidos=Files.readAllLines(ref,StandardCharsets.UTF_8);
            
        
        }catch(IOException e){

                return -1;

            }
            
            return 1;


    }

    public String obtenerLinea(int i){

        return partidos.get(i);
    }

    public void crearPartido(String partido,int golesLocal, int golesVisitante){

        Partido p=new Partido(partido,golesLocal,golesVisitante);
        quiniela.añadirPartido(p);
    }

    public int getNumeroPartidos(){

        return NUMERO_PARTIDOS;
    }

    public String crearTabla(){

       return quiniela.crearTabla();

    }


    public String obtenerTabla(){

        return quiniela.obtenerTablaQuiniela();
    }

    

}
