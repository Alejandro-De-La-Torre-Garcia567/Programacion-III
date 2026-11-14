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

                return 1;

            }
            
            return 0;


    }

    public void obtenerLinea(int i){

        partidos.get(i);
    }

    public void crearPartido(String partido,int golesLocal, int golesVisitante){

        Partido p=new Partido(partido,golesLocal,golesVisitante);

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
