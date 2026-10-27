package sitio;
import java.util.HashMap;
import libreria.Libro;


public class Biblioteca {

    private HashMap<String,Libro> base= new HashMap<>();



    public void agregarLibro(String isbn, Libro l){

        base.put(isbn,l);

    }    


    public Libro buscarLibro(String isbn){

        if(base.containsKey(isbn)){
            
            Libro l =base.get(isbn);

            return l;
            }

            else return null;

    }


}
