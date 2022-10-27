package Funciones.Ejercicios;

public class Operadores {
    //funciones pueden estar aca
    public static void main(String[] args) {
        int resultadoSuma = suma(1,2);
        System.out.println("La suma es: "+resultadoSuma);
        int resultadoResta = resta(1,2);
        System.out.println("La resta es: "+resultadoResta);
        int resultadoMulti = multi(1,2);
        System.out.println("La multi es: "+resultadoMulti);
        float resultadodiv = div(0,2);
        if(resultadodiv == 0){
            System.out.println("no se puede divodir con 0");
        }else{
            System.out.println("La div es: "+resultadodiv);
        }
        //funciones puenden estar aca igual
    }
    public static int suma(int a , int b){
        return a+b;
    }
    public static int resta(int a , int b){
        return a-b;
    }
    public static int multi(int a , int b){
        return a*b;
    }
    public static float div(float a , float b){
        if(a == 0.0 || b == 0.0){
            return 0;
        }else{
            return a/b;
        }
    }
}
