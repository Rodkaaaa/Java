import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends OPersona{
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE");
        String nombre = leer.nextLine();
        System.out.println("INGRESE SU EDAD");
        int edad = leer.nextInt();
        //scanner pero version consola
        Console console = System.console();
        //imprimir o salida con consola 
        console.printf("ingrese su nombre", args);
        System.out.println("INGRESE SU APELLIDO");
        String apellido = console.readLine("Tambien se puede agregar el mensaje en cosole redline");
        System.out.println("Su nombre es: " + nombre + ", su apellido es: " + apellido + ", y tiene una edad de: " + edad);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int[] numArray = {9,8,7,6,5,4,3,2,1};
        for (int j : numArray) {
            System.out.println(j);
        } 
        String[] strArray = {"a","b","c","e","r","e","s","f","2"};
        for (String string : strArray) {
            System.out.println(string);
        }
        suma(8,8);
        sumaStr("Frederick", "Cid");
        int resultado = sumRe(5);
        System.out.println(resultado);
        Double altura = 1.5;
        int alt = altura.intValue();
        console.printf(alt + " de Bolean a int", args);
        String numerosStr = "123";
        Integer.parseInt(numerosStr);
    }
    public static void suma(int num1, int num2){
        System.out.println((num1+num2)); 
    };
    public static void sumaStr(String a, String b) {
        System.out.println(a + " " + b);
    }
    
    public static int sumRe(int num){
        if (num == 1) {
            return 1;
        } else {
            return num + sumRe(num-1);
        }
    }    
    
}
