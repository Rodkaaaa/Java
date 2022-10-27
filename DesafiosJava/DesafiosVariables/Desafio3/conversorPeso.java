//borrar este package esta echo de mi pc
package DesafiosJava.DesafiosVariables.Desafio3;

import java.util.Scanner;

public class conversorPeso{
/* conversorPeso
cree un menú en donde se le pida al usuario ingresar:
1 si desea covertir el peso en marte
2 si desea convertir el peso en luna.
Luego pida al usuario el peso que desea convertir.
realice la busqueda de cuantos kilos en tierra son en marte y en la luna
calcule cuanto sería el peso ingresado
muestre en pantalla el siguente mensaje según la seleccion del usuario
"El peso ingresado en la luna sería de: ...."
"El peso ingresado en Marte sería de: ...."
El peso ingresado en la luna sería de: 8.27 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("ingrese su peso: ");
        Double peso = sc.nextDouble();
        System.out.println("******************************");
        System.out.println("Donde desea calcular el peso");
        System.out.println("1) La luna");
        System.out.println("2) Marte");
        System.out.println("3) Tierra");
        System.out.println("******************************");
        //opc es la opcion que lanzaremos en el switch el cual nos hara poder elegir la opcion que queremos
        //opc puede ser cualquier tipo de dato solo buscar la manera mas facil de hacer las selecciones
        int opc = sc.nextInt();
        
        //switch primera parte se absorbe el tipo de dato que necesitamos comparar
        switch(opc){
            case 1 : // case es como el primer if luego se agrega el dato a comprar en este caso es el 1
            //esto seria asi "opc == 1"
                //opción para luna
                System.out.println("******************************");
                System.out.println("Su peso en la luna sera: " + Math.round(peso*0.165) + "kg");
                System.out.println("******************************");
                break;
            case 2 :
                // para marte
                System.out.println("******************************");
                System.out.println("Su peso en la marte sera: " + Math.round((peso*3.711)/9.81) + "kg");
                System.out.println("******************************");
                break;
            case 3 :
                // para tierra
                System.out.println("******************************");
                System.out.println("Su peso en la marte sera: " + Math.round(peso) + "kg");
                System.out.println("******************************");
                break;
            default:// default se ejecuanta cuando la variable no puede ser comparada con nningun case, es el else si lo comparamos
                // opcion en caso que no agregue una opción valida
                System.out.println("******************************");
                System.out.println("Ingrese una opción valida");
                System.out.println("******************************");
        }
    }
}

/* double d = 9.4568982982989;
         double scale = Math.pow(10, 3);
         double doubleM1 = Math.round(d*scale)/scale;
         System.out.println("Math1 Rounded off: "+doubleM1);
 */
/* double d = 9.4568982982989;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String formattedDouble = decimalFormat.format(d);
        System.out.println("Formatted double d = "+formattedDouble); */
