package Modelo;

public class Modelo {

    private int num1,num2,suma,resta;
    

    public void setNum1(int n){
        this.num1=n;
    }

    public void setNum2(int n){
        this.num2=n;
    }

    public void calcularSuma(){
       this.suma=this.num1+this.num2;
    }

    public void calcularResta(){
        this.resta=this.num1-this.num2;
    }

    public int getSuma(){
        return suma;
    }

    public int getResta(){
        return resta;
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return num2;
    }
}
