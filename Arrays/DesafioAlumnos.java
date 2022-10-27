import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class DesafioAlumnos {
/*vamos a pedirle al usuario la cantidad de alumnos que va a ingresar 
pedir por cada alumno el nombre y que ingrese 3 notas por alumno 
(guardar en arrayList)
estos valores se van aguardar en un hashMap en donde la 
llave será el nombre del alumno y el valor será el arreglo con sus 3 notas*/
    public static void main(String[] args) {
        //Scanner es mas aplio en absorber datos, pero necesita mas validaciones que el console
        Scanner sc = new Scanner(System.in);
        //definir hashmap y sus valores a absorber con "<>"
        HashMap <String , ArrayList> resultado = new HashMap<String, ArrayList>();
        //DecimalFormat: delimita con un formato los decimales , se puede dar mas tipos de formatos con esta funcion
        DecimalFormat df = new DecimalFormat("#.0");
        String nombre = "";
        Double nota = null;
        //diseño tipo menu 
        System.out.println("*****************************************************");
        System.out.println("                     Bienvenido                      ");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Ingrese la cantidad de alumnos para agregar sus notas");
        System.out.println("*****************************************************");
        // Absorbemos la cantidad de alumnos 
        int alumnos = sc.nextInt();
        //hacemos blucle para pedirle al usuario que ingrese las notas a la cantidad de alumnos que ingreso
        for (int i = 0; i < alumnos; i++) {
            //agregamos el arraylist adentro del bucle, para poder agregar las notas de manera nueva y que no se reemplazen
            //en esta parte lo agregamos aca para que inicie nuevamentee de 0 y no reemplazar sus valores
            ArrayList <Double> notas = new ArrayList<Double>();
            notas.clear();
            System.out.println("*****************************************************");
            System.out.println("Ingrese el nombre del alumno");
            System.out.println("*****************************************************");
            nombre = sc.next();
            //bucle para que usuario ingrese las 3 notas por alumnos
            for (int j = 0; j < 3; j++) {
                //while True es un bucle infinito que podemos detener con un break cuando sea necesario
                while(true){
                    System.out.println("Ingrese la nota N " + (j+1) + ", Del alumno N " + (i+1)+ " " + nombre);
                    nota = sc.nextDouble();
                    //condicional que solicita al usuario un limite de como agregar la variable
                    if (nota>=1 && nota <=7 ){
                        //agregar nota por nota al arraylist
                        notas.add(nota);
                        //break para terminar la ejecucion del while True
                        break;
                    //en caso que el usuario ingrese mal la variable se le mandara este mensaje
                    }else{
                        System.out.println("Ingrese una nota valida, mayor a 0 y menor o igual a 7 \n");
                    }
                }
            }
            //agregamos los datos solicitados al hashmap
            resultado.put(nombre,notas);
        }
        System.out.println("*****************************************************");
        //recorremos hashmap con foreach lamba
        resultado.forEach((k,v) -> System.out.println("Alumno: " + k + ", Sus notas son: " + v ));
        System.out.println("*****************************************************");
        //bucle foreach para recorrer hashmap 
        for (String i : resultado.keySet()){
            //definimos variable segun el valor numeral que hayamos definido anteriormente
            Double suma = 0.0;
            //recorremos el arraylist para ponder sumar numero por numero para depuse sacar el promedio
            for(Object x : resultado.get(i)){
                // x nos lo tomara como un objeto el (Double) le da a definir que ese objeto tiene que ser un Double(o valor que hayamos definido)
                suma += (Double) x;
            }
            System.out.println("*****************************************************");
            //imprimimos el promedio, y aca invocamos el formato que dimos arriba.
            //el formato lo invocamos con el nombre que le dimos.
            //ej: nombre.format(variable que queremos dar el formato)
            //------------------------------------------------------------------------
            //resultado.get(i).size() = nos muestra el largo del array
            //ej: [2,45,67,342,54].seze() = 5
            //     1+2+3+4+5 = 5
            // con esa funcion podemos medir el largo para sacar el promedio
            System.out.println("El promedio de "+ i +", es: " + (df.format(suma/resultado.get(i).size())));
            System.out.println("*****************************************************");
        }
        System.out.println("*****************************************************");
        System.out.println("                 Fin de la ejecución                 ");
        System.out.println("*****************************************************");
    }
}
