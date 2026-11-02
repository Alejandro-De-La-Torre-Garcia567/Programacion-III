package Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class Controlador {

    Vista v;
    Modelo m;

    public Controlador(Vista v, Modelo m){

        this.v=v;
        this.m=m;
    }


    public void run(){

        boolean t=true;
        boolean s=false;
        boolean d=false;

        while(t){

           

            v.showMenu();

            v.showMessage("\nIntroduzca una opción: ");
            int o=v.getOption();

            if(o==1){
    
                m.setNum1(v.getNumberInput("Introduzca el primer número: "));
                m.setNum2(v.getNumberInput("Introduzca el segundo número: "));
                s=true;

            }else if(o==2 && s){

            v.showMessage("\n\nSuma calculada correctamente\n\n");
            m.calcularSuma();
            d=true;

            }else if(o==3 && s && d){

            v.showResult(m.getSuma(),"El resultado de la suma es: \n\n");
            
            }else if(4==o){

                v.showMessage("Saliendo del programa");
                t=false;
           
            }else

                v.showMessage("\n\nOpción incorrecta\n\n");




        }
    }

}
