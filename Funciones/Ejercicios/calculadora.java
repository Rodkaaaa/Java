package Funciones.Ejercicios;

import java.io.Console;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        int opc = 0;
        while (opc != 5) {
            opc = 0;
            int num1 = 0, num2 = 0, resultado = 0;
            float num3 = 0f, num4 = 0f, resultadoDiv = 0f;
            System.out.println("***********************");
            System.out.println("   ingreses la opción  ");
            System.out.println("***********************");
            System.out.println("1) suma");
            System.out.println("2) resta");
            System.out.println("3) multi");
            System.out.println("4) div");
            System.out.println("5) salir");
            try {
                opc = Integer.parseInt(console.readLine());
            } catch (Exception e) {
                System.out.println(e + " ,ingresa un numero lpm");
            }

            switch (opc) {
                // opc == 1
                case 1:
                    System.out.println("ingrese primer numero");
                    num1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = sc.nextInt();
                    resultado = suma(num1, num2);
                    System.out.println("La suma es: " + resultado);
                    break;

                case 2:
                    System.out.println("ingrese primer numero");
                    num1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = sc.nextInt();
                    resultado = resta(num1, num2);
                    System.out.println("La resta es: " + resultado);
                    break;
                // opc == "multi"
                case 3:
                    System.out.println("ingrese primer numero");
                    num1 = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    num2 = sc.nextInt();
                    resultado = multi(num1, num2);
                    System.out.println("La multi es: " + resultado);
                    break;

                case 4:
                    System.out.println("ingrese primer numero");
                    num3 = sc.nextFloat();
                    System.out.println("ingrese segundo numero");
                    num4 = sc.nextFloat();
                    resultadoDiv = div(num3, num4);
                    if (resultadoDiv == 0) {
                        System.out.println("no se puede dividir con 0");
                        break;
                    } else {
                        System.out.println("La div es: " + resultadoDiv);
                        break;
                    }
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("opción invalida");
            }
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static float div(float a, float b) {
        if (a == 0.0 || b == 0.0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
