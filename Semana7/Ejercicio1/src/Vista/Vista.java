package Vista;
import java.util.Scanner;
import Controlador.*;

public class Vista {

    Scanner sc= new Scanner(System.in);
    private Controlador c;
    private boolean num1=false;
    private boolean num2=false;

    public void initMenu(){

        boolean exit=false;
        String option;

        while(!exit){
        System.out.printf("1.-Leer los números\n2.-Calcular la suma\n3.-Mostrar el resultado\n4.-Salir\n");
            
            System.out.printf("Introduzca una opción: ");    

           option = sc.nextLine();

            switch(option){

                case "1":

                    setNum1();
                    setNum2();

                    break;
                    case "2":

                      calculateSum();

                        break;

                        case "3":

                            showRessult();

                            break;
                            case "4":
                            
                            System.out.println("Ha salido del programa");

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



    private void setNum1(){

        int i;

        System.out.printf("Introduzca el primer número: ");
        try{i=sc.nextInt();

        c.setNum1(i);
        System.out.println("Número establecido correctamente");
        this.num1=true;

        }catch(Exception e){

            System.out.println("Formato incorrecto");
            return;
        }

 
    }



    private void setNum2(){

        int i;
        
     System.out.printf("Introduzca el segundo número: ");

        try{i=sc.nextInt();

        c.setNum2(i);
        System.out.println("Número establecido correctamente");
            num2=true;

        }catch(Exception e){

            System.out.println("Formato incorrecto");
            return;
        }


 
    }




    private void calculateSum(){


        if(num1==false || num2==false){

            System.out.println("No se han introducido ambos números");
            return;

        }

        c.calculateSum();
        System.out.println("Suma calculada correctamente");

    }


    private void showRessult(){

        if(num1==false || num2==false){

            System.out.println("No se han introducido ambos números");
            return;

        }
        
        int i=c.showRessult();
        System.out.printf("El resultado de la suma es: %d\n",i);

    }

}
