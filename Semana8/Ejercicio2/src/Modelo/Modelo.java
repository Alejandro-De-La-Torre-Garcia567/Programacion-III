package Modelo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Modelo {

    private static final int NUMERO_PARTIDOS = 15;

    private List<String> partidos = new ArrayList<>();
    private Quiniela quiniela = new Quiniela();

    public int leerArchivo() {
        Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "equipos.txt");

        try {
            List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);

            if (lineas.size() != NUMERO_PARTIDOS) {
                return -1;
            }

            for (String linea : lineas) {
                if (linea.trim().isEmpty()) {
                    return -1;
                }
            }

            partidos = new ArrayList<>(lineas);
            quiniela = new Quiniela();
            return 1;
        } catch (IOException e) {
            return -1;
        }
    }

    public List<String> getPartidos() {
        return new ArrayList<>(partidos);
    }

    public boolean registrarPartido(String partido, int golesLocal, int golesVisitante) {
        Partido nuevoPartido = new Partido(partido, golesLocal, golesVisitante);
        return quiniela.añadirPartido(nuevoPartido);
    }

    public boolean estaCompleta() {
        return quiniela.estaCompleta();
    }

    public String obtenerTabla() {
        return quiniela.obtenerTablaQuiniela();
    }
}