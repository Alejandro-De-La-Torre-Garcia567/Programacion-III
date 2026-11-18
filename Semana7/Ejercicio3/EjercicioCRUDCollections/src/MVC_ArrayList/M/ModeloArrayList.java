package MVC_ArrayList.M;

import java.util.ArrayList;
import java.util.List;

public class ModeloArrayList {

    private final List<Persona> personas = new ArrayList<>();

    public boolean agregarPersona(Persona persona) {
        if (persona == null) {
            return false;
        }

        return personas.add(persona);
    }

    public boolean eliminarPersona(String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre)) {
                personas.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean modificarPersona(String nombre, String nuevoNombre,
            int nuevaEdad, double nuevaAltura) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                persona.setNombre(nuevoNombre);
                persona.setEdad(nuevaEdad);
                persona.setAltura(nuevaAltura);
                return true;
            }
        }

        return false;
    }

    public List<Persona> getPersonas() {
        return new ArrayList<>(personas);
    }
}