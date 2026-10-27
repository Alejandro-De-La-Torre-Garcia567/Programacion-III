package libreria;

public class Libro {



    private String isbn,autor,titulo,genero;



    public void setIsbn(String isbn){

        this.isbn=isbn;

    }


    public String getIsbn(){

        return this.isbn;
    }


    public void setAutor(String autor){

        this.autor=autor;
    }


    public String getAutor(){

        return this.autor;
    }


    public void setTitulo(String titulo){

        this.titulo=titulo;
    }

    public String getTitulo(){

        return this.titulo;
    }


    public void setGenero(String genero){

        this.genero=genero;
    }


    public String getGenero(){

        return this.genero;
    }

    @Override
    public String toString(){

        return "Libro [Título: "+ this.titulo + ", Autor: " + this.autor +", Género: " + this.genero + ", Isbn: " + this.isbn + "]";

    }


}
