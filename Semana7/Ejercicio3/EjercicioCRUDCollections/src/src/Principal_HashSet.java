package src;

import src.MVC_HashSet.C.ControladorHashSet;
import src.MVC_HashSet.M.ModeloHashSet;
import src.MVC_HashSet.V.VistaHashSet;

public class Principal_HashSet {

    public static void main(String[] args) {
        ModeloHashSet modelo = new ModeloHashSet();
        VistaHashSet vista = new VistaHashSet();
        ControladorHashSet controlador = new ControladorHashSet();

        controlador.run(modelo, vista);
    }
}
