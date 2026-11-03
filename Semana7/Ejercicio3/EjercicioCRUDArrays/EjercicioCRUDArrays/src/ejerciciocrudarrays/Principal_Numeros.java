package ejerciciocrudarrays;

import ejerciciocrudarrays.MVC_ArraysPrimitivos.C.ControladorNumeros;
import ejerciciocrudarrays.MVC_ArraysPrimitivos.M.ModeloNumeros;
import ejerciciocrudarrays.MVC_ArraysPrimitivos.V.VistaNumeros;

public class Principal_Numeros {

    public static void main(String[] args) {
        ModeloNumeros modelo = new ModeloNumeros();
        VistaNumeros vista = new VistaNumeros();
        ControladorNumeros controlador = new ControladorNumeros();

        controlador.run(modelo, vista);
    }
}
