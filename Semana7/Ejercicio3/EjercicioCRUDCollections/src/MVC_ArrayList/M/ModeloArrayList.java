package MVC_ArrayList.M;
import java.util.ArrayList;

public class ModeloArrayList {


    private ArrayList<Persona>personas=new ArrayList<>();



    
    public void agregarPersona(String nombre, int edad, double altura) {

        personas.add(new Persona(nombre, edad, altura));

    }


    public boolean eliminarPersona(String nombre) {

        boolean p=true;
        Persona personaAEliminar = null;

        // Atención se debe tener especial cuidado cuando se recorre una
        // colección y se elimina uno de sus elementos. No deberíamos
        // eliminar un elemento empleando el bucle for each
        // Como alternativa se podría eliminar utilizando un iterator.
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personaAEliminar = persona;
                break;
            }
        }
        if (personaAEliminar != null) {
            personas.remove(personaAEliminar);
            return p;
        
        } else {            
            p=false;
            return p;
        }
    }

    public boolean modificarPersona(String nombre,String nuevoNombre, int nuevaEdad, double nuevaAltura) {

        boolean e=true;
        Persona personaAModificar = null;

        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personaAModificar = persona;
                break;
            }
        }
        if (personaAModificar != null) {
            personaAModificar.setNombre(nuevoNombre);
            personaAModificar.setEdad(nuevaEdad);
            personaAModificar.setAltura(nuevaAltura);
        
        return e;
        
        } else {
            
            e=false;
            return e;
        }
    }

    public String listarPersonas() {

        String r="";

        if (personas.isEmpty()) {

            return "No hay personas en la lista";
        }else

            
        for(Persona p: personas){

            r+=(p.getEstadoComoString() + "\n");
        }

        return r;
    }


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