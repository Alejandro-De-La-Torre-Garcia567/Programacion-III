package Modelo;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;
import java.util.List;

public class Modelo {

    private List<String> partidos;

    private Quiniela quiniela=new Quiniela();
    private final int NUMERO_PARTIDOS = 15;
    private int contador=0,contadorArray=0;
    Partido[] partidosArray=new Partido[NUMERO_PARTIDOS];


    public int leerArchivo(){

        Path ref= Paths.get(System.getProperty("user.home"), "Desktop", "equipos.txt");

            try{

            this.partidos=Files.readAllLines(ref,StandardCharsets.UTF_8);
            
        
        }catch(IOException e){

                return 1;

            }
            
            return 0;


    }

    public String obtenerPartido(){

        if(this.contador<NUMERO_PARTIDOS){
        
        String p=partidos.get(contador);
        
        this.contador++;
        return p;
    
        }else

            return "Error: no se ha podido obtener ningún partido o no quedan más en el txt";
        

           
    }

    public void crearPartido(int golesLocal, int golesVisitante){

        Partido p=new Partido(golesLocal,golesVisitante);

        partidosArray[contadorArray]=p;
        contadorArray++;
    }

    public int getNumeroPartidos(){

        return NUMERO_PARTIDOS;
    }

    public String crearTabla(){

       return quiniela.crearTabla(partidosArray);

    }


    public String obtenerTabla(){

        return quiniela.obtenerTablaQuiniela();
    }

    

}
