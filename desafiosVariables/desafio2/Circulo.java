import java.io.Console;

/* <!-- Desafio 2
Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo 
y calcule el área y el perímetro del círculo.
Realice una operación de conversión ampliada (de entero a doble) al almacenar 
el resultado de las operaciones.
Imprime los resultados de las dos operaciones en la consola. -->
 */

public class Circulo {

public static void main(String []args) {
System.out.println("Bienvenido, usted podrá calcular el área y el perímetro de un círculo");

Console leer = System.console();
String diametro = leer.readLine();
int diametro_nuevo = Integer.parseInt(diametro);
double radio = Integer.parseInt(diametro_nuevo/2);

double pi = 3.1416;
Double alCuadrado = Math.pow((diametro_nuevo));

double area = (pi * alCuadrado); 
int perimeter = (int) (pi* diametro_nuevo);

System.out.println("El cuadrado de un número es: " + alCuadrado);
System.out.println("El área del perímetro de su círculo es: "+ area +
" mientras que el perimetro es " + perimeter);
    
    }
}