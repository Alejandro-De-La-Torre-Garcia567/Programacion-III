package ejerciciocrudcollections.MVC_ArrayList.ModeloArrayList;
import java.util.ArrayList;

public class ModeloArrayList {


    ArrayList<Persona>lista=new ArrayList<>();

    




}





 class Persona {
    
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEstadoComoString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Son referencias a lo mismo entonces true
            return true;
        if (obj == null) // Si el objeto es nulo, entonces false
            return false;
        if (getClass() != obj.getClass()) // Si las clases no son iguales, entonces false
            return false;
        Persona other = (Persona) obj; // Hacemos un cast a Persona
        if (nombre == null) {
            if (other.nombre != null) // Si el nombre es nulo, y el otro no, entonces false
                return false;
        } else if (!nombre.equals(other.nombre))
            return false; // Si los nombres no son iguales, entonces false
        return true;  // Si no se cumple ninguna de las anteriores, entonces true (son iguales)
    }

}