package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

    private final Vista vista;
    private final Modelo modelo;

    public Controlador(Modelo modelo, Vista vista) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControlador(this);
    }

    public void init() {
        if (modelo.leerArchivo() != 1) {
            vista.showMessage("No se pudo cargar equipos.txt. Comprueba que esté en el Escritorio y tenga exactamente 15 partidos.");
            return;
        }

        vista.showMessage("Se han cargado los 15 partidos correctamente.");
        vista.solicitarResultados(modelo.getPartidos());

        if (!modelo.estaCompleta()) {
            vista.showMessage("No se pudo completar la quiniela con los 15 resultados.");
            return;
        }

        vista.mostrarQuiniela(modelo.obtenerTabla());
    }

    public boolean registrarPartido(String partido, int golesLocal, int golesVisitante) {
        return modelo.registrarPartido(partido, golesLocal, golesVisitante);
    }
}