package src.MVC_HashMap.M;

import java.util.HashMap;

public class ModeloHashMap {


    private HashMap<String,Persona>personas= new HashMap<>();



      public void agregarPersona(String dni, String nombre, int edad, double altura){
        
        personas.put(dni, new Persona(dni,nombre, edad, altura));
    }

    public boolean eliminarPersona(String dni) {

        boolean t=true;

        if (personas.containsKey(dni)) {
            personas.remove(dni);
            return t;

        } else {
            t=false;
            return t;
        }
    }

    public boolean modificarPersona(String dni,String nuevoNombre, int nuevaEdad, double nuevaAltura) {

        boolean t=true;

        if (personas.containsKey(dni)) {

            Persona personaModificada = new Persona(dni,nuevoNombre, nuevaEdad, nuevaAltura);
            personas.put(dni, personaModificada);

            return t;
        } else {
            
            t=false;
            return t;
        }
    }

    public String listarPersonas() {

        String r="";
        // Si está vacío, no se puede recorrer
        if (personas.isEmpty()) {
            
            r="No hay personas en el HashMap";
            return r;
        }

        for(Persona p: personas.values()){

            r+=p.getEstadoComoString();
        }

        return r;
    }

}


 class Persona {
    
    private String nombre, DNI;
    private int edad;
    private double altura;

    public Persona(String DNI,String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.DNI=DNI;
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