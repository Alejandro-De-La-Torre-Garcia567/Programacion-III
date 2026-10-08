public class parametros {
    public static void main(String[] args) throws Exception {

        if(args.length!=2){

            System.out.printf("Numero de parárametros introducidos incorrecto");
            return;
        }


        float sum1,sum2;

        try{
        sum1=Float.parseFloat(args[0]);
        sum2=Float.parseFloat(args[1]);
    
         }catch(Exception e){

        System.out.printf("Tipo de parámetros incorrecto");
        return;

        }
        System.out.printf("El resultado es: %.3f",sum1+sum2);


    }
}
