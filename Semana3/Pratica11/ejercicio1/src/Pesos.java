import java.io.Console;



 class Person{

private    String name;
private    int weight, height;

//getters y setters

public String getName(){
    return name;
}

public void setName(String name){

    this.name=name;
}


public int getWeight(){

    return weight;
}


public void setWeight(int weight){

    this.weight=weight;
}



public int getHeight(){

    return height;
}


public void setHeight(int height){

    this.height=height;
}



}







public class Pesos {
    public static void main(String[] args) throws Exception {
        

    Console c = System.console();        

        if(c==null){

            System.err.println("No console.");
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
        p1.setWeight(Integer.parseInt(c.readLine("Ingrese su peso: ")));
       }catch(Exception e){
        System.out.println("Error al ingresar el peso");
    return;   
    }

       try{
        p1.setHeight(Integer.parseInt(c.readLine("Ingrese su altura: ")));
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
        p2.setWeight(Integer.parseInt(c.readLine("Ingrese su peso: ")));
       
    }catch(Exception e){

        System.out.println("Error al ingresar el peso");
        return;

    }

    try{
        p2.setHeight(Integer.parseInt(c.readLine("Ingrese su altura: ")));
    
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
        p3.setWeight(Integer.parseInt(c.readLine("Ingrese su peso: ")));
    }catch(Exception e){
        System.out.println("Error al ingresar el peso");
        return;
    }

    try{
        p3.setHeight(Integer.parseInt(c.readLine("Ingrese su altura: ")));
    }catch(Exception e){
        System.out.println("Error al ingresar la altura");
        return;
    }


    if(p1.getWeight() == p2.getWeight() && p2.getWeight() == p3.getWeight()){

        System.out.println(p1.getName()+", "+p2.getName()+" y "+p3.getName()+" tienen el mismo peso");
    
    
    }else if (p1.getWeight() > p2.getWeight() && p1.getWeight() > p3.getWeight()){

        System.out.println(p1.getName()+" es el más pesado");

    }else if (p2.getWeight() > p1.getWeight() && p2.getWeight() > p3.getWeight()){

        System.out.println(p2.getName()+" es el más pesado");

    }else{

        System.out.println(p3.getName()+" es el más pesado");

    }



}
}