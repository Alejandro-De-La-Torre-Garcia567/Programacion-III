package src.MVC_HashSet.M;

import java.util.HashSet;
import src.MVC_HashSet.Persona;

public class ModeloHashSet {

    private HashSet<Persona> personas = new HashSet<>();

    public boolean agregarPersona(String nombre, int edad, double altura) {
        return personas.add(new Persona(nombre, edad, altura));
    }

    public boolean eliminarPersona(String nombre) {
        return personas.remove(new Persona(nombre, 0, 0));
    }

    public boolean modificarPersona(String nombre, String nuevoNombre, int nuevaEdad, double nuevaAltura) {
        Persona personaAnterior = new Persona(nombre, 0, 0);

        if (!personas.contains(personaAnterior)) {
            return false;
        }

        Persona personaNueva = new Persona(nuevoNombre, nuevaEdad, nuevaAltura);
        if (!nombre.equals(nuevoNombre) && personas.contains(personaNueva)) {
            return false;
        }

        personas.remove(personaAnterior);
        return personas.add(personaNueva);
    }

    public String listarPersonas() {
        if (personas.isEmpty()) {
            return "No hay personas en el HashSet.";
        }

        String resultado = "";
        for (Persona persona : personas) {
            resultado += persona.getEstadoComoString() + "\n";
        }

        return resultado;
    }
}
