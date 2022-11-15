import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

import javax.swing.SortOrder;

import DesafiosJava.DesafiosVariables.Desafio2.Main;

public class main {
    public static void main(String[] args) {
        ArrayList datos = new ArrayList<>(Array.as)
    }

    public static int descuento(ArrayList a) {
        int contador = 0;
        for (Object datos : a) {
            if ((int) datos < 0) {
                contador++;
            }
        }
        // deben jugar con los datos si el contador da positivo deben hacer un if
        // diciendo si el contadoe
        // es positivo o mayor a 0 y mandar un mensaje al usuario que el existen numeros
        // negativos
        return contador;
    }

    public static ArrayList masCostoso(ArrayList a) {
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,  Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }
}
