import java.util.Scanner;

public class BuclesEjercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de tickets \n");
        int tickets = sc.nextInt();
        int contador = 0;

        while (tickets > contador) {

            contador++;
            System.out.println("Ingrese edad /n");
            int edad = sc.nextInt();
            float precio = 7;
            if (edad < 5) {
                System.out.println("El precio en Euros es " + Math.round(precio * 0.4));
            } else if (edad > 60) {
                System.out.println("El precio en Euros es " + Math.round(precio * 0.45));
            } else {
                System.out.println("El precio en Euros es " + precio);
            }

        }

    }
}
