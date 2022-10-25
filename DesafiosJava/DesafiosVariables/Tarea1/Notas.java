package DesafiosJava.DesafiosVariables.Tarea1;

import java.util.Scanner;

/* Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa 
devuelva una nota basada en las siguientes condiciones:
Suspendió si obtuvo una nota igual o inferior a 3.
Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
Excelente si consiguió un 10
Debe avisar si se ingresa un número fuera del rango (0 a 10) */
public class Notas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su nota");
    int nota = sc.nextInt();
    System.out.println("Su nota fue: (con ifelse) ");
    notas(nota);
    System.out.println("Su nota fue: (con switch) ");
    notasSwitch(nota);
  }
  public static void notas(int nota){
    if(nota>0 && nota<=3){
        System.out.println("Reprobado");
    }else if(nota>3 && nota <=5){
        System.out.println("Insuficiente");
    }else if(nota>5 && nota<=8){
        System.out.println("Bueno");
    }else if(nota <= 9 && nota >=10){
        System.out.println("Excelente");
    }else{
        System.out.println("ingreso un número fuera del rango (0 a 10)");
    }
  }
  public static void notasSwitch(int nota) {
    switch (nota) {
        case 1,2,3:
            System.out.println("Reprobado");
            break;
        case 4,5:
            System.out.println("Insuficiente");
            break;
        case 6,7,8:
            System.out.println("Bueno");   
            break;
        case 9,10:
            System.out.println("Excelente");
            break;
        default:
            System.out.println("ingreso un número fuera del rango (0 a 10)");
            break;
            
    }
  }  
}

