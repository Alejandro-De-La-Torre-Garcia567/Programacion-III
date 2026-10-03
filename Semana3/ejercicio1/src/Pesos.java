import java.io.Console;



 class Person{

private    String name;
private    float weight, height;

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

    if(weight<0 || weight>200){

        System.out.printf("Error: peso erroneo");
        System.exit(1);

    }

    this.weight=weight;
}



public float getHeight(){

    return height;
}


public void setHeight(float height){

    if(height<0 || height>3){

        System.out.printf("Error: altura incorrecta");
        System.exit(1);
        
    }

    this.height=height;
}



}







public class Pesos {
    public static void main(String[] args) throws Exception {
        

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

        System.out.println(p1.getName()+", "+p2.getName()+" y "+p3.getName()+" tienen el mismo peso");
    
    
    }else if (p1.getWeight() > p2.getWeight() && p1.getWeight() > p3.getWeight()){

        System.out.println(p1.getName()+" es el más pesado");

    }else if (p2.getWeight() > p1.getWeight() && p2.getWeight() > p3.getWeight()){

        System.out.println(p2.getName()+" es el más pesado");

    }else{

        System.out.println(p3.getName()+" es el más pesado");

    }


    //Quién es el más alto?



    


}
}