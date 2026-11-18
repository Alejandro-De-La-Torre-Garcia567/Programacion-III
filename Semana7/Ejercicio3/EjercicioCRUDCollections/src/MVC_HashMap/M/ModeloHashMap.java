package MVC_HashMap.M;

import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap {

    private final Map<String, Persona> personas = new HashMap<>();

    public boolean agregarPersona(String dni, Persona persona) {
        if (dni == null || persona == null) {
            return false;
        }

        String clave = dni.trim();
        if (clave.isEmpty() || personas.containsKey(clave)) {
            return false;
        }

        personas.put(clave, persona);
        return true;
    }

    public boolean eliminarPersona(String dni) {
        if (dni == null) {
            return false;
        }

        return personas.remove(dni.trim()) != null;
    }

    public boolean modificarPersona(String dni, Persona persona) {
        if (dni == null || persona == null) {
            return false;
        }

        String clave = dni.trim();
        if (!personas.containsKey(clave)) {
            return false;
        }

        personas.put(clave, persona);
        return true;
    }

    public Map<String, Persona> getPersonas() {
        return new HashMap<>(personas);
    }
}