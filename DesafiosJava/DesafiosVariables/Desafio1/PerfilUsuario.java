package DesafiosJava.DesafiosVariables.Desafio1;
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
        //invocamos Localdate , sirve para invocar datos de fecha con algun formato(String) absorbe la fecha actual del pc
        //en este caso absorbo mi fecha actual el cual me devuelve 27102022 , sin separar los datos
        LocalDate anioActual = LocalDate.now();
        //damos formato del datos que necesitamos en este caso yo solo invoco el año actual de mi pc
        //formato mas comun seria "DD-MM-YYYY" el cual transforma el dato de arriba 27102022 a 27-10-2022
        //pero yo solo solicite el año para restarlo a la edad y sea un codigo escalable
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("YYYY");
        // aplicamos el formato al año que absorbimos
        String anioFormatter = anioActual.format(formato);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Preferencia laboral: " + PrefLab);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Tipo de sangre: " + TipoSangre);
        //aplicamos variable de la fecha con el formato y le restamos la edad para saber en que año nacio
        System.out.println("año de nacimiento: "+ ( Integer.parseInt(anioFormatter) - edad ));

        


    }
}