import java.io.Console;


class Alumno{

    private float parcial1,parcial2;
    private float fnal;


    public Alumno(){

        this.parcial1=0;
        this.parcial2=0;
        this.fnal=0;

    }


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

    public static void main(String[] args){

        
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

            alumnos[i]=new Alumno();

            try{
            alumnos[i].setParcial1(Float.parseFloat(c.readLine("Introduzca la nota del primer parcial del alumno"+" "+(i+1)+": ")));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }


            try{
            alumnos[i].setParcial2(Float.parseFloat(c.readLine("Introduzca la nota del segundo parcial del alumno"+" "+(i+1)+": ")));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }


            try{
            alumnos[i].setFinal(Float.parseFloat(c.readLine("Introduzca la nota del final del alumno"+ " "+(i+1)+": ")));
            
        }catch(Exception e){

                System.out.printf("Tipo de dato erroneno, vuelva a intentarlo");
                i--;
                continue;

        }

        System.out.printf("\n\n");

        }

        float notaFinal=0;

        for(i=0;i<a;i++){

            notaFinal+=alumnos[i].calcularMediaAlumno();

        }


        notaFinal=(notaFinal/a);


        System.out.printf("\n\n");
        System.out.printf("+---------------------------------------------------------+\n");
        System.out.printf("|                     BOLETIN DE NOTAS                    |\n");
        System.out.printf("+---------------------------------------------------------+\n");
        System.out.printf("| Alumno   | Parcial 1 | Parcial 2 |   Final   |    Nota Final |\n");
        System.out.printf("+---------------------------------------------------------+\n");

        for(i = 0; i < a; i++){
            System.out.printf("| Alumno %-2d|   %5.2f   |   %5.2f   |   %5.2f   |     %5.2f     |\n", 
                (i + 1), 
                alumnos[i].getParcial1(), 
                alumnos[i].getParcial2(), 
                alumnos[i].getFinal(), 
                alumnos[i].calcularMediaAlumno()
            );
        }

        System.out.printf("+---------------------------------------------------------+\n");
        System.out.printf("| MEDIA DE LA CLASE:                                %5.2f |\n", notaFinal);
        System.out.printf("+---------------------------------------------------------+\n\n");



    }


}