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

    public Libro actualizarLibro(String isbn){

        if(base.containsKey(isbn)){
    
        return base.get(isbn);
    }else

        System.out.printf("No se ha encotrado el libro");
     return null;

    }


    public int eliminarLibro(String isbn){

        if(base.containsKey(isbn)){

            base.remove(isbn);
            return 1;

        }

        System.out.println("No se ha encontrado el libro a eliminar en el sistema");

        return -1;
    }


    public void mostrarLibros(){

        for(Libro t:base.values()){


            System.out.println(t);
        }


    }

}
