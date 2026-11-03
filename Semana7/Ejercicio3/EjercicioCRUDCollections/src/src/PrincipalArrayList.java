package src;
import src.MVC_ArrayList.M.ModeloArrayList;
import src.MVC_ArrayList.V.VistaArrayList;
import src.MVC_ArrayList.C.ControladorArrayList;

public class PrincipalArrayList {

    public static void main(String args[]){
    ModeloArrayList m= new ModeloArrayList();
    VistaArrayList v= new VistaArrayList();
    ControladorArrayList c= new ControladorArrayList();

    c.run(m,v);
}


}
