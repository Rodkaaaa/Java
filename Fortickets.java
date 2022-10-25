import java.text.DecimalFormat;
import java.util.Scanner;

public class Fortickets {
    public static void main(String[] args) {
        double entrada = 0, suma = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("ingrese cantidad de tickets a comprar");
        int repeticiones = sc.nextInt();
        for (int i = 0; i < repeticiones; i++) {
            System.out.println("Ingrese la edad del cliente N: " + (i+1));
            int edad = sc.nextInt();
            if (edad < 5 && edad > 0) {
                entrada = 7 * 0.4;
                System.out.println("El valor de la entrada es: $" + df.format(entrada));
                suma += entrada;
            } else if (edad > 60) {
                entrada = 7 * 0.45;
                System.out.println("El valor de la entrada es: $" + df.format(entrada));
                suma += entrada;
            } else {
                entrada = 7;
                System.out.println("El valor de la entrada es: $" + entrada);
                suma += entrada;
            }
        }
        System.out.println("total a pagar es: $"+ df.format(suma));
        
    }

}
