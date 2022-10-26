

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("Arrays");
        //Arrays
        //inicializar array
        int [] miArray = new int[3];
        //definir datos en pocicion de array
        miArray[0]= 1;
        miArray[1]= 2;
        miArray[2]= 3;
        System.out.println("Imprimir con sout " + Arrays.toString(miArray));
        //recorrer array
        for (int i : miArray) {
            System.out.println(i);
        }
        System.out.println("ArrayList");
        //ArrayList
        //inicializar ArrayList
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        //agregar en arraylist
        miArrayList.add(1);
        miArrayList.add(4);
        miArrayList.add(6);
        System.out.println();
        //recorrer datos en arraylist
        for (Object object : miArrayList) {
            System.out.println(object);
        }
        System.out.println("HashMap");
        //HashMap
        //definir HashMap
        Map<Integer, String> miHashMap = new HashMap<Integer,String>();
        //Agregar datos en HashMap
        miHashMap.put(1, "Frederick");
        miHashMap.put(2, "Freddy");
        miHashMap.put(3, "Fredd");
        miHashMap.put(4, "Alex");
        //recorrer
        miHashMap.forEach((k,v) -> System.out.println("key: " + k + " Value: " + v));
        //recorrer V2
        for (Integer i : miHashMap.keySet()) {
            System.out.println(i + " " + miHashMap.get(i));
        }
        System.out.println("HashMap agregar array list");
        // agregar array list en diccionario
        Map<String, ArrayList> miHashMap2 = new HashMap<String,ArrayList>();
        miHashMap2.put("zapatilla",miArrayList);
        //Recorrer
        miHashMap2.forEach((k,v)-> System.out.println("key: " + k + " Value: " + v));
        //Recorrer con ForEach logica
        for (String i : miHashMap2.keySet()) {
            System.out.println(i + " " + miHashMap.get(i));
        }

        System.out.println("Arraylist se agregando datos en la misma linea");
        //Arraylist se agregando datos en la misma linea
        ArrayList<Integer> miArrayList2 = new ArrayList <Integer>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<String> miArrayListStr = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
        //recorrer arraylist nuevamente
        for (int value : miArrayList2) {
            System.out.println(value);
        }
        //recorrer arraylist por 3ra vez xdxd
        for (String str : miArrayListStr) {
            System.out.println(str);
        }
    }
}