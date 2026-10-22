package paquete1;

public class Clase1 {

    public int a1;
    int a2;
    protected int a3;
    private int a4;

    public void m1(){

        System.out.printf("Hola, método 1");

    }

    void m2(){

        System.out.printf("Hola, método 2");


    }


    protected void m3(){

        System.out.printf("Hola, método 3");
    }



    private void m4(){

        System.out.printf("Hola, método 4");
    }


    //setter para el atributo 4

    public void setA4(int a4){

        this.a4=a4;

    }


}
