package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysConWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.println("Ingrese cantidad de tickets \n");
        int tickets = sc.nextInt();
        int contador = 0;
        double PrecioEntrada = 0;
        double suma = 0 ;
        ArrayList<Double> PorfavorMiLista = new ArrayList<Double>();
        while(tickets>contador){
            contador++;
            System.out.println("Ingrese edad \n");
            int edad = sc.nextInt();
            float precio = 7;
            if (edad < 5) {
                PrecioEntrada = Math.round(precio * 0.4);
                System.out.println("El precio en Euros es $" + PrecioEntrada);
                PorfavorMiLista.add(PrecioEntrada);
            } else if (edad > 60) {
                PrecioEntrada = Math.round(precio * 0.45);
                System.out.println("El precio en Euros es $" + PrecioEntrada);
                PorfavorMiLista.add(PrecioEntrada);
            } else {
                PrecioEntrada = precio;
                System.out.println("El precio en Euros es $" + PrecioEntrada);
                PorfavorMiLista.add(PrecioEntrada);
            }
        }
        for (Double obj : PorfavorMiLista) {
            System.out.println("Valor de la entrada: $" + obj);
            suma += obj;
        }
        System.out.println(PorfavorMiLista);
        System.out.println("El total es: $"+ suma);
    }
}
