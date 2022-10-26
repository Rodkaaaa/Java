import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.transform.Source;

public class DesafioAlumnos {
/*vamos a pedirle al usuario la cantidad de alunos que va a ingresar 
pedir por cada alumno el nombre y que ingrese 3 notas por alumno 
(guardar en arrayList)
estos valores se van aguardar en un hashMap en donde la 
llave será el nombre del alumno y el valor será el arreglo con sus 3 notas*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String , ArrayList> resultado = new HashMap<String, ArrayList>();
        DecimalFormat df = new DecimalFormat("#.0");
        String nombre = "";
        Double nota = null;
        System.out.println("*****************************************************");
        System.out.println("                     Bienvenido                      ");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Ingrese la cantidad de alumnos para agregar sus notas");
        System.out.println("*****************************************************");

        int alumnos = sc.nextInt();
        for (int i = 0; i < alumnos; i++) {
            ArrayList <Double> notas = new ArrayList<Double>();
            notas.clear();
            System.out.println("*****************************************************");
            System.out.println("Ingrese el nombre del alumno");
            System.out.println("*****************************************************");
            nombre = sc.next();
            for (int j = 0; j < 3; j++) {
                while(true){
                    System.out.println("Ingrese la nota N " + (j+1) + ", Del alumno N " + (i+1)+ " " + nombre);
                    nota = sc.nextDouble();
                    if (nota>=1 && nota <=7 ){
                        notas.add(nota);
                        break;
                    }else{
                        System.out.println("Ingrese una nota valida, mayor a 0 y menor o igual a 7 \n");
                    }
                }
            }
            resultado.put(nombre,notas);
        }
        System.out.println("*****************************************************");
        resultado.forEach((k,v) -> System.out.println("Alumno: " + k + ", Sus notas son: " + v ));
        System.out.println("*****************************************************");
        for (String i : resultado.keySet()){
            Double suma = 0.0;
            for(Object x : resultado.get(i)){
                suma += (Double) x;
            }
            System.out.println("*****************************************************");
            System.out.println("El promedio de "+ i +", es: " + (df.format(suma/resultado.get(i).size())));
            System.out.println("*****************************************************");
        }
    }
}
