package Modelo;

public class Partido {


    // Constantes
    public static final int[] COLUMNAS = { 20, 20, 1 };

    // Atributos
    int golesLocal;
    int golesVisitante;
    

    // Constructores

    public Partido(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    // Obtener resultado como string
    public String getResultado() {
        
        // Si local 1, visitante 2 empate X
        if (golesLocal > golesVisitante) {
            return "1";
        } else if (golesLocal < golesVisitante) {
            return "2";
        } else {
            return "X";
        }
    }


    // Getters y setters


    public int getGolesLocal() {
        return golesLocal;
    }


    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }


    public int getGolesVisitante() {
        return golesVisitante;
    }


    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
}
