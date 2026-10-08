
class Usuario{

    String nombre;
    float peso,altura;


public Usuario(String nombre,float peso, float altura){


    this.nombre=nombre;
    this.peso=peso;
    this.altura=altura;

}



static Usuario factory(String [] datos){

String nnombre="";
float naltura=0;
float npeso=0;

    try{

     nnombre=datos[0];
    npeso=Float.parseFloat(datos[1]);
    naltura=Float.parseFloat(datos[2]);


    }catch(Exception e){
        System.out.printf("Tipo de parámetros incorrecto");
        System.exit(1);
    }

    
 return new Usuario(nnombre,npeso,naltura);

}



}






public class Pesos {
    public static void main(String[] args) throws Exception {

        if(args.length!=3){

            System.out.printf("Cantidad de párametros incorrecta");
            return;
        }



    }
}
