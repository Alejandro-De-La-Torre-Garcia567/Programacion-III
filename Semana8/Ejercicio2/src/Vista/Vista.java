package Vista;

import es.usal.progiii.tools.Esdia;
import Controlador.Controlador;
import java.util.List;

public class Vista {

    private Controlador controlador;

    public void solicitarResultados(List<String> partidos) {
        for (int i = 0; i < partidos.size(); i++) {
            String partido = partidos.get(i);

            System.out.println("\n--- PARTIDO " + (i + 1) + " ---");
            System.out.println(partido);

            int golesLocal = Esdia.readInt("Introduzca los goles del equipo local: ");
            int golesVisitante = Esdia.readInt("Introduzca los goles del equipo visitante: ");

            if (!controlador.registrarPartido(partido, golesLocal, golesVisitante)) {
                showMessage("No se pudo añadir el resultado de este partido.");
                return;
            }
        }
    }

    public void mostrarQuiniela(String tabla) {
        System.out.println(tabla);
    }

    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}