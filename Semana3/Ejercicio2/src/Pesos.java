import java.io.Console;


 class Person{

private    String name;
private    float weight, height, IMC;


//Constructor



public Person(){

    this.name="Fulanito";
    this.weight=0;
    this.height=0;
    this.IMC=0;

}

//IMC

public float IMC() {

    if(this.height<=0 || this.weight<=0){

        System.out.printf("Error: Valores incorrectos");
        System.exit(1);
    }


    this.IMC=(this.weight/((this.height)*(this.height)));

    return this.IMC;
}


//getters y setters

public String getName(){
    return name;
}

public void setName(String name){

    this.name=name;
}


public float getWeight(){

    return weight;
}


public void setWeight(float weight){

    if(weight<=0 || weight>200){

        System.out.printf("Error: peso erroneo");
        System.exit(1);

    }

    this.weight=weight;
}



public float getHeight(){

    return height;
}


public void setHeight(float height){

    if(height<=0 || height>=3){

        System.out.printf("Error: altura incorrecta");
        System.exit(1);
        
    }

    this.height=height;
}



}



public class Pesos {
    public static void main(String[] args){
        

    Console c = System.console();        

        if(c==null){

            System.err.println("No hay una consola disponible");
            return;
        }
    
//persona 1


       Person p1=new Person();

       try{
        p1.setName(c.readLine("Ingrese su nombre: "));

       }catch(Exception e){
        System.out.println("Error al ingresar el nombre");
       return;
    }

       try{
        p1.setWeight(Float.parseFloat(c.readLine("Ingrese su peso en kg: ")));
       }catch(Exception e){
        System.out.println("Error al ingresar el peso");
    return;   
    }

       try{
        p1.setHeight(Float.parseFloat(c.readLine("Ingrese su altura en m: ")));
       }catch(Exception e){
        System.out.println("Error al ingresar la altura");
       return;
    }


//persona 2

       Person p2=new Person();

       try{
        
        p2.setName(c.readLine("Ingrese su nombre: "));

       }catch(Exception e){
        System.out.println("Error al ingresar el nombre");
       return;
    }

       try{
        p2.setWeight(Float.parseFloat(c.readLine("Ingrese su peso en kg: ")));
       
    }catch(Exception e){

        System.out.println("Error al ingresar el peso");
        return;

    }

    try{
        p2.setHeight(Float.parseFloat(c.readLine("Ingrese su altura en m: ")));
    
    }catch(Exception e){

        System.out.println("Error al ingresar la altura");
        return;
    }


    //persona 3

    Person p3=new Person();


    try{

        
        p3.setName(c.readLine("Ingrese su nombre: "));
    }catch(Exception e){
        System.out.println("Error al ingresar el nombre");
        return;
    }


    try{
        p3.setWeight(Float.parseFloat(c.readLine("Ingrese su peso en kg: ")));
    }catch(Exception e){
        System.out.println("Error al ingresar el peso");
        return;
    }

    try{
        p3.setHeight(Float.parseFloat(c.readLine("Ingrese su altura en m: ")));
    }catch(Exception e){
        System.out.println("Error al ingresar la altura");
        return;
    }


    //Quién es el más pesado?

    if(p1.getWeight() == p2.getWeight() && p2.getWeight() == p3.getWeight()){

        System.out.printf("Todos tienen el mismo peso");
    
    
    }else if (p1.getWeight() > p2.getWeight() && p1.getWeight() > p3.getWeight()){

        System.out.printf("El mas pesado es %s (%.2f kg)\n", p1.getName(),p1.getWeight());

    }else if (p2.getWeight() > p1.getWeight() && p2.getWeight() > p3.getWeight()){

        System.out.printf("El más pesado es %s (%.2f kg)\n", p2.getName(), p2.getWeight());

    }else{

        System.out.printf("El más pesado es %s (%.2f kg)\n",p3.getName(),p3.getWeight());

    }


    //Quién es el más alto?


    if( (p1.getHeight() == p2.getHeight()) && (p1.getHeight() == p3.getHeight()) && (p2.getHeight() == p3.getHeight()) ){

        System.out.printf("Todas las personas tienen la misma altura");

    }


    else if( ( p2.getHeight() > p1.getHeight() ) && (p2.getHeight()> p3.getHeight())){

        System.out.printf("El más alto es %s (%.2f m)\n", p2.getName(), p2.getHeight());

    } 

    else if( ( p1.getHeight() > p2.getHeight() ) && (p1.getHeight()> p3.getHeight())){

        System.out.printf("El más alto es %s (%.2f m)\n", p1.getName(), p1.getHeight());

    }else{

        System.out.printf("El más alto es %s (%.2f m)\n", p3.getName(), p3.getHeight());


    }


}
}