import paquete1.Clase1;

//la clase 1 si se puede importar porque cuenta con el modificador public

// import paquete1.Clase2;

//la clase 2 al no tener el modificador de visibilidad public no se puede implementar en el paquete2


public class App extends Clase1 {

    public static void main(String args[]){

        Clase1 c1= new Clase1(); 


        c1.a1=22;

        //c1.a2=2;
        //no podemos acceder al atributo 2 porque no cuenta con visibilidad fuera de su paquete al no contar con modificador de visbilidad, solo tiene visibilidad dentro de su propio paquete
        
        //c1.a3=5;
        //debido a que solo podemos acceder a traves de una instancia de la clase hija, no podemos acceder con objeto de la clase padre, es decir de la clase 1

        App app=new App();

        app.a3=5;
        //accedemos al atributo protected a través de un objeto de la clase hija App


        //c1.a4=5; no podemos acceder directamente debido al modificador private, tenemos que implementar un setter para cambiar el valor o un getter para obtenerlo en la clase1

        //llamamos al método setter para cambiar el valor, se utiliza para poner una serie de condiciones a la hora de poner el valor del atributo
        c1.setA4(5);


        //podemos acceder directamente porque tiene el public
        c1.m1();

        //no podemos acceder al método porque solo tiene visibilidad de paquete
        //c1.m2();


        //no podemos acceder directamente con una instancia de la clase principal porque el protected solo nos permite el acceso con instancias u objetos de la clase hija
        //c1.m3();

        //usamos el objeto de la clase que recibe herencia de la clase 1
        app.m3();

        // no podemos acceder porque el modificador private solo permite visibilidad dentro de su propia clase 
        //c1.m4();





    }


}