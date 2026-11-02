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

        while(t){


            v.showMenu();

            int o=v.getOption();

            if(o==1){
    
                m.setNum1(v.getNumberInput("Introduzca el primer número"));
                m.setNum2(v.getNumberInput("Introduzca el segundo número"));

            }else if(o==2){

            m.calcularSuma();

            }else if(o==3){

            v.showResult(m.getSuma(),"El resultado de la suma es: ");
            
            }else if(4==o){

                v.showMessage("Saliendo del programa");
                t=false;
            }


        }
    }

}
