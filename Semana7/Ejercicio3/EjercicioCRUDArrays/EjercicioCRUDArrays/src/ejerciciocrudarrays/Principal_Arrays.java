package ejerciciocrudarrays;

import ejerciciocrudarrays.MVC_Arrays.C.ControladorArrays;
import ejerciciocrudarrays.MVC_Arrays.M.ModeloArrays;
import ejerciciocrudarrays.MVC_Arrays.V.VistaArrays;

public class Principal_Arrays {

    public static void main(String[] args) {
        ModeloArrays modelo = new ModeloArrays();
        VistaArrays vista = new VistaArrays();
        ControladorArrays controlador = new ControladorArrays();

        controlador.run(modelo, vista);
    }
}
