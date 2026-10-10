import java.io.Console;


class Alumno{

    private float parcial1,parcial2;
    private float fnal;

    public void setParcial1 (float nota){

        this.parcial1=nota;
    }


    public float getParcial1 (){

        return parcial1;
    }

    public void setParcial2(float nota){

        this.parcial2=nota;
    }

    public float getParcial2(){

        return parcial2;
    }


    public void setFinal(float nota){

        this.fnal=nota;

    }


    public float getFinal(){

        return this.fnal;
    }


    public float calcularMediaAlumno(){

        return (float)((0.1*parcial1)+(0.1*parcial2)+(0.8*fnal));
    }


}








public class Alumnos{

    public static void main(String args){

        
        Console c= System.console();

        if (c==null){

            System.out.printf("No hay una consola disponible");
            return;
        }

        int a,i;

        try{

            a=Integer.parseInt(c.readLine("Introduzca el numero de alumnos que hay en el curso: "));

        }catch (Exception e){

            System.out.printf("Tipo de valor incorrecto");
            return;
        }

        Alumno alumnos []= new Alumno[a];



        for(i=0;i<alumnos.length;i++){


            try{
            alumnos[i].setParcial1(Float.parseFloat(c.readLine("Introduzca la nota del primer parcial del alumno"+ " "+(i+1))));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }


            try{
            alumnos[i].setParcial2(Float.parseFloat(c.readLine("Introduzca la nota del segundo parcial del alumno"+ " "+(i+1))));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }


                    try{
            alumnos[i].setFinal(Float.parseFloat(c.readLine("Introduzca la nota del final del alumno"+ " "+(i+1))));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }

        }





    }


}