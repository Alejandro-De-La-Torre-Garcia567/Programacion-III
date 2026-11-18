package MVC_ArrayList.C;

import MVC_ArrayList.M.ModeloArrayList;
import MVC_ArrayList.M.Persona;
import MVC_ArrayList.V.VistaArrayList;
import java.util.List;

public class ControladorArrayList {

    private final ModeloArrayList modelo;
    private final VistaArrayList vista;

    public ControladorArrayList(ModeloArrayList modelo, VistaArrayList vista) {
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

    public boolean modificarPersona(String nombre, String nuevoNombre,
            int edad, double altura) {
        return modelo.modificarPersona(nombre, nuevoNombre, edad, altura);
    }

    public List<Persona> obtenerPersonas() {
        return modelo.getPersonas();
    }
}