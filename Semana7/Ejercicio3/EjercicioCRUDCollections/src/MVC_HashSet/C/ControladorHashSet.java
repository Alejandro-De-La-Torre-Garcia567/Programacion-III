package MVC_HashSet.C;

import MVC_HashSet.M.ModeloHashSet;
import MVC_HashSet.Persona;
import MVC_HashSet.V.VistaHashSet;
import java.util.Set;

public class ControladorHashSet {

    private final ModeloHashSet modelo;
    private final VistaHashSet vista;

    public ControladorHashSet(ModeloHashSet modelo, VistaHashSet vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public void run() {
        vista.initMenu();
    }

    public boolean agregarPersona(Persona persona) {
        return modelo.agregarPersona(persona);
    }

    public boolean eliminarPersona(String nombre) {
        return modelo.eliminarPersona(nombre);
    }

    public boolean modificarPersona(String nombre, Persona personaNueva) {
        return modelo.modificarPersona(nombre, personaNueva);
    }

    public Set<Persona> obtenerPersonas() {
        return modelo.getPersonas();
    }
}