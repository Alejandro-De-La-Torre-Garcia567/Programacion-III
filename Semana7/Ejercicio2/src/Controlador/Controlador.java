package Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

    Modelo m;
    Vista v;

    public Controlador(Modelo m, Vista v){

        this.m=m;
        this.v=v;
    }

    public void run(){

    boolean t=true;
    boolean ventas=false;
    boolean precios=false;
    boolean calculos=false;


        while(t){
    
            v.showMenu();
            String o= v.getUserOption();


            if(o.equals("q")){

                v.showMessage("\n\nSaliendo del programa");

            
            }else if(1==Integer.parseInt(o)){

                int i;

                if(ventas==true){

                m.deleteAlmacen();

                }

                for(i=0;i<5;i++){

                    m.setAlmacen();

                    v.getAlmacenUnidadesText("\n\nIntroduzca la cantidad de unidades vendidas por el almacen %d del primer producto: ",i);
                    m.setUnidades1(i,v.getAlmacenUnidades());
                    
                }


                for(i=0;i<5;i++){

                    v.getAlmacenUnidadesText("\n\nIntroduzca la cantidad de unidades vendidas por el almacen %d del segundo producto: ",i);
                    m.setUnidades2(i,v.getAlmacenUnidades());
                    
                }


                ventas=true;



            }else if(2==Integer.parseInt(o) && ventas){


                v.showMessage("Introduzca el precio global para el producto 1");
                m.setPrecio1(v.getUserPrecio());

                v.showMessage("\nIntroduzca el precio global para el producto 2");
                m.setPrecio2(v.getUserPrecio());

                precios=true;

            }else if(3==Integer.parseInt(o) && precios && ventas){
            

                int i;

                for(i=0;i<5;i++){

                    m.calcularIngresos1(i);
                    m.calcularIngresos2(i);
                }

                m.calcularIngresosTotales();
                v.showMessage("\n\nIngresos calculados correctamente\n\n");


                calculos=true;

            }else if(4==Integer.parseInt(o) && precios && ventas && calculos){

                int i;

                for(i=0;i<5;i++){

                    v.showFinalResults(i,m.getIngresos1(i)+m.getIngresos2(i));

                }

                v.showTotal(m.getIngresosTotales());

            }else

                v.showMessage("\n\nOpción incorrecta o datos insufcientes\n\n");

        }


    }

}
