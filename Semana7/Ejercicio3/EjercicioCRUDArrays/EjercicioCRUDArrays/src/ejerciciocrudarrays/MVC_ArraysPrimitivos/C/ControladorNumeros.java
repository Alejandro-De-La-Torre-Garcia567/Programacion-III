package ejerciciocrudarrays.MVC_ArraysPrimitivos.C;

import ejerciciocrudarrays.MVC_ArraysPrimitivos.M.ModeloNumeros;
import ejerciciocrudarrays.MVC_ArraysPrimitivos.V.VistaNumeros;

public class ControladorNumeros {

    public void run(ModeloNumeros modelo, VistaNumeros vista) {
        int opcion;

        do {
            vista.showMenu();
            opcion = vista.getUserOption();

            switch (opcion) {
                case 1: {
                    int numero = vista.getNumber();
                    if (modelo.agregarNumero(numero)) {
                        vista.showMessage("Número añadido correctamente.");
                    } else {
                        vista.showMessage("El array de números está lleno.");
                    }
                    break;
                }
                case 2: {
                    int numero = vista.getNumber();
                    if (modelo.eliminarNumero(numero)) {
                        vista.showMessage("Número eliminado correctamente.");
                    } else {
                        vista.showMessage("Número no encontrado.");
                    }
                    break;
                }
                case 3: {
                    int numero = vista.getNumber();
                    int nuevoNumero = vista.getNewNumber();
                    if (modelo.modificarNumero(numero, nuevoNumero)) {
                        vista.showMessage("Número modificado correctamente.");
                    } else {
                        vista.showMessage("Número no encontrado.");
                    }
                    break;
                }
                case 4:
                    vista.showMessage(modelo.listarNumeros());
                    break;
                case 5:
                    vista.showMessage("Saliendo del programa.");
                    break;
                default:
                    vista.showMessage("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
