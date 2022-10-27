import java.text.DecimalFormat;
import java.util.Scanner;

/* Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount */
public class EjercicioGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int suma = 0;
        double entrada = 0;
        DecimalFormat df = new DecimalFormat("#.00");
        //while true es un bucle infinito el cual se detiene con un break
        //es importante agregar un break en alguna condicion en el caso de no hacerlo se repitira infinitamente
        //es muy util para validar datos y repetir cierta parte para que el usuario ingrese un dato deseado
        while (true) {
            System.out.println("Ingrese la edad del cliente N: " + count + " o ingrese 0 para salir");
            int edad = sc.nextInt();
            if (edad < 5 && edad > 0) {
                entrada = 7 * 0.4;
                System.out.println("El valor de la entrada es: $" + df.format(entrada));
                suma += entrada;
            } else if (edad > 60) {
                entrada = 7 * 0.45;
                System.out.println("El valor de la entrada es: $" + df.format(entrada));
                suma += entrada;

            } else if (edad == 0) {
                //aca agrego el break para romper el bucle
                break;
            } else {
                entrada = 7;
                System.out.println("El valor de la entrada es: $" + entrada);
                //esto seria igual a "suma = suma + entradas"
                suma += entrada;
            }
            //esto seria igual a "count = count + 1"
            count++;
        }
        System.out.println("El total de costo de la entrada es $" + suma);
    }
}


