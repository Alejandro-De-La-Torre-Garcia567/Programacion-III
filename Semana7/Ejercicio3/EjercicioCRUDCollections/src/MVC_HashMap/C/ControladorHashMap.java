package MVC_HashMap.C;

import MVC_HashMap.M.ModeloHashMap;
import MVC_HashMap.M.Persona;
import MVC_HashMap.V.VistaHashMap;
import java.util.Map;

public class ControladorHashMap {

    private final ModeloHashMap modelo;
    private final VistaHashMap vista;

    public ControladorHashMap(ModeloHashMap modelo, VistaHashMap vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public void run() {
        vista.initMenu();
    }

    public boolean agregarPersona(String dni, Persona persona) {
        return modelo.agregarPersona(dni, persona);
    }

    public boolean eliminarPersona(String dni) {
        return modelo.eliminarPersona(dni);
    }

    public boolean modificarPersona(String dni, Persona persona) {
        return modelo.modificarPersona(dni, persona);
    }

    public Map<String, Persona> obtenerPersonas() {
        return modelo.getPersonas();
    }
}