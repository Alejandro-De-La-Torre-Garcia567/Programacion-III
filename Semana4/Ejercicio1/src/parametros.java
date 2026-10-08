public class parametros {
    public static void main(String[] args) throws Exception {

        if(args.length!=2){

            System.out.printf("Numero de parárametros introducidos incorrecto");
        }


        int sum1,sum2;

        sum1=Integer.parseInt(args[0]);
        sum2=Integer.parseInt(args[1]);

        System.out.printf("El resultado es: %d",sum1+=sum2);


    }
}
