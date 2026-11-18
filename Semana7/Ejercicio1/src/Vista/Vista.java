package Vista;
import java.util.Scanner;
import java.util.InputMismatchException;
import Controlador.*;

public class Vista {

    Scanner sc= new Scanner(System.in);
    private Controlador c;
    private boolean num1=false;
    private boolean num2=false;
    private boolean sumaCalculada=false;

    public void initMenu(){

        boolean exit=false;
        String option;

        while(!exit){
        System.out.printf("1.-Leer los números\n2.-Calcular la suma\n3.-Mostrar el resultado\n4.-Salir\n");
            
            System.out.printf("Introduzca una opción: ");    

           option = sc.nextLine();

            switch(option){

                case "1":

                    num1=false;
                    num2=false;
                    sumaCalculada=false;

                    if(setNum1()){
                        setNum2();
                    }

                    break;
                    case "2":

                      calculateSum();

                        break;

                        case "3":

                            showRessult();

                            break;
                            case "4":
                            
                            System.out.println("Ha salido del programa");
                            exit=true;

                                break;
                                default:
                                    System.out.println("Opción incorrecta vuelva a intentarlo");


            }
    
    
        }
    }

    public void setControlador(Controlador c){

        this.c=c;

    }


    public void showMessage(String m){
        System.out.printf("%s",m);
    }



    private boolean setNum1(){

        int i;

        System.out.printf("Introduzca el primer número: ");
        try{
            i=sc.nextInt();
            sc.nextLine();

        c.setNum1(i);
        System.out.println("Número establecido correctamente");
        this.num1=true;
        return true;

        }catch(InputMismatchException e){

            sc.nextLine();
            System.out.println("Formato incorrecto");
            return false;
        }

 
    }



    private boolean setNum2(){

        int i;
        
     System.out.printf("Introduzca el segundo número: ");

        try{
            i=sc.nextInt();
            sc.nextLine();

        c.setNum2(i);
        System.out.println("Número establecido correctamente");
            num2=true;
            return true;

        }catch(InputMismatchException e){

            sc.nextLine();
            System.out.println("Formato incorrecto");
            return false;
        }


 
    }




    private void calculateSum(){


        if(num1==false || num2==false){

            System.out.println("No se han introducido ambos números");
            return;

        }

        c.calculateSum();
        sumaCalculada=true;
        System.out.println("Suma calculada correctamente");

    }


    private void showRessult(){

        if(num1==false || num2==false){

            System.out.println("No se han introducido ambos números");
            return;

        }

        if(!sumaCalculada){

            System.out.println("Primero debe calcular la suma");
            return;
        }
        
        int i=c.showRessult();
        System.out.printf("El resultado de la suma es: %d\n",i);

    }

}
