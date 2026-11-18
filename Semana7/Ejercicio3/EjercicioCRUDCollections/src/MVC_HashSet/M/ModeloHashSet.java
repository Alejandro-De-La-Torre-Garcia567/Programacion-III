package MVC_HashSet.M;

import java.util.HashSet;
import java.util.Set;
import MVC_HashSet.Persona;

public class ModeloHashSet {

    private final Set<Persona> personas = new HashSet<>();

    public boolean agregarPersona(Persona persona) {
        if (persona == null) {
            return false;
        }

        return personas.add(persona);
    }

    public boolean eliminarPersona(String nombre) {
        return personas.remove(new Persona(nombre, 0, 0));
    }

    public boolean modificarPersona(String nombre, Persona personaNueva) {
        if (nombre == null || personaNueva == null) {
            return false;
        }

        Persona personaAnterior = new Persona(nombre, 0, 0);
        if (!personas.contains(personaAnterior)) {
            return false;
        }

        if (!nombre.equals(personaNueva.getNombre())
                && personas.contains(personaNueva)) {
            return false;
        }

        personas.remove(personaAnterior);
        return personas.add(personaNueva);
    }

    public Set<Persona> getPersonas() {
        return new HashSet<>(personas);
    }
}