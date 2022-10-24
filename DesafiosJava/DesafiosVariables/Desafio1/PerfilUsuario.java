
import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.Console;
public class PerfilUsuario {
    /*Desafio 1:
    Cree una clase titulada "Perfil de usuario"
    crear funcion main
    Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
    Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
    Utilice la edad para calcular el año en que nació un usuario.
    Imprima los valores en la consola de un usuario. */

    public static void main(String[] args) {
        Console consola = System.console();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("ingrese su genero");
        char genero = leer.next().charAt(0);
        
        System.out.println("Ingrese su Preferencia laboral");
        String PrefLab = consola.readLine();

        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = consola.readLine();

        System.out.println("Ingrese su Tipo de Sangre");
        String TipoSangre = consola.readLine();

        LocalDate anioActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("YYYY");
        String anioFormatter = anioActual.format(formato);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Preferencia laboral: " + PrefLab);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Tipo de sangre: " + TipoSangre);
        System.out.println("año de nacimiento: "+ ( Integer.parseInt(anioFormatter) - edad ));

        


    }
}