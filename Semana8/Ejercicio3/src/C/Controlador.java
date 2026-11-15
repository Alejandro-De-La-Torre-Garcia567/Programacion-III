package C;
import M.*;
import V.*;

public class Controlador {



    public void run(Modelo modelo, Vista vista){

        int o;

        do{
        
        vista.showMenu();
        o=vista.getUserOption();


        if(o==1){



        }else if(o==2){



        }else if(o==3){



        }else if(o==4){



        }else if (o==5){



        }else

            vista.wrongOption();
    
        
    
        }while(o!=5);

    }

}
