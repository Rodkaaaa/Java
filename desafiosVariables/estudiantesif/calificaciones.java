import java.io.Console;

public class calificaciones {
    public static void main(String [] args) {
        System.out.println("Bienvenido al programa de resultados de calificaciones");

        Console leer = System.console();

        float nota = Float.parseFloat(leer.readLine("Ingresa su nota"));
        
        /*      
        String nota_String = leer.readLine("Favor ingrese su nota");
        int nota = Integer.parseInt(nota_String) ; */

        //Para hacer las dos lineas en una
        // n
        //float nota = Float.parseFloat(console.readline(Ingresa su nota)) ; el float tira error

        if (nota <=3 ){
            System.out.println("Suspendió \n" );
        }else if(nota>3 && nota<5){
                System.out.println("Insuficiente \n");
        }else if(nota >5 && nota < 8){
        System.out.println("Bueno \n" );
        }else if(nota == 9 || nota ==10){
            System.out.println("Excelente  \n" );
        }else{
            System.out.println("Favor ingresar numero dentro de rango 0 a 10 \n  Hola");
        }
    }
}
