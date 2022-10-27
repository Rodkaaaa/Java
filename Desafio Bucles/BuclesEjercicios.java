import java.util.ArrayList;
import java.util.Scanner;

public class BuclesEjercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //crear Scanner
        ArrayList<Double> miArray = new ArrayList<Double>(); //Crear array para poder mostrar informacion completa 
        System.out.println("Ingrese cantidad de tickets \n");
        int tickets = sc.nextInt();
        int contador = 0;

        
        int suma = 0;
        Double precioConDescuento = 0.0;
        while (tickets > contador) {
            contador++;
            System.out.println("Ingrese edad \n");
            int edad = sc.nextInt();
            Double precio = 7.0;
            if (edad < 5) {
                precioConDescuento += Math.round(precio * 0.4);
                System.out.println("El precio en Euros es " + precioConDescuento);
                miArray.add(precioConDescuento);
            } else if (edad > 60) {
                precioConDescuento += Math.round(precio * 0.45);
                System.out.println("El precio en Euros es " + precioConDescuento);
                miArray.add(precioConDescuento);
            } else {
                precioConDescuento = precio;
                System.out.println("El precio en Euros es " + precioConDescuento);
                miArray.add(precioConDescuento);
            }
        }
        for(double obj : miArray){
            System.out.println(obj);
            suma += obj;
        }
        System.out.println(miArray);
        System.out.println("El total es: $"+ suma);

    }
}
