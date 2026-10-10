
class Usuario{

    String nombre;
    float peso,altura;


public Usuario(String nombre,float peso, float altura){

if(peso<0 || peso>300){

    System.out.printf("Valor del peso incorrecto");
    System.exit(1);

}

if(altura<0 || altura >3){

    System.out.printf("Valor de altura incorrecto");
    System.exit(1);

}

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


public float IMC(){

 float IMC=(this.peso/(this.altura*this.altura));

 return IMC;
}



}






public class Pesos {
    public static void main(String[] args) throws Exception {

        if(args.length!=3){

            System.out.printf("Cantidad de párametros incorrecta");
            return;
        }

        Usuario u=Usuario.factory(args);



        System.out.printf("\nNOMBRE\tPESO\tALTURA\tIMC\n");
        System.out.printf("\n%s\t%.2f\t%.2f\t%.2f\n\n",u.nombre,u.peso,u.altura,u.IMC());
        

    }
}
