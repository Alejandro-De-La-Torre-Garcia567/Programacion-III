package Vista;
import java.util.Scanner;
import Controlador.*;

public class Vista {

    Scanner sc= new Scanner(System.in);
    Controlador c;

    public void initMenu(){

        boolean exit=false;
        String option;

        while(exit){
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


        try{i=sc.nextInt();

        }catch(Exception e){

            System.out.println("Formato incorrecto");
            return;
        }

        c.setNum1(i);
        System.out.println("Número establecido correctamente");
    }



    private void setNum2(){

        int i;
        
        
        try{i=sc.nextInt();

        }catch(Exception e){

            System.out.println("Formato incorrecto");
            return;
        }


        c.setNum2(i);
        System.out.println("Número establecido correctamente");
    }




    private void calculateSum(){

        c.calculateSum();
        System.out.println("Suma calculada correctamente");

    }


    private void showRessult(){

        int i=c.showRessult();
        System.out.printf("El resultado de la suma es: %d",i);

    }

}
