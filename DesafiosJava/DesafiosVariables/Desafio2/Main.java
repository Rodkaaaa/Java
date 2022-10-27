package DesafiosJava.DesafiosVariables.Desafio2;
import java.util.Scanner;

public class Main{
    /*Desafio 2
    Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
    Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
    Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
    Imprime los resultados de las dos operaciones en la consola.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el diámetro del circulo: ");
        Double num1 = sc.nextDouble();
        System.out.println("El Perímetro es: ");
        perimetro(num1);
        System.out.println("El Area es: ");
        area(num1);
    }
    public static void perimetro(Double num1) {
        System.out.println(Math.round(Math.PI * Math.pow((num1/2), 2)));
    }

    public static void area(Double num1) {
        System.out.println("el Area es : " +  Math.round(Math.PI * Math.pow(num1, 2)) / 4);
    }
}