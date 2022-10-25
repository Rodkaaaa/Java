import java.io.Console;

public class perfilUsuario {
    
/*     Cree una clase titulada "Perfil de usuario"
crear funcion main--
Escriba el código para que la aplicación almacene el nombre, la edad, el género, 
la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
Piense en los nombres de variables que desea asignar a las propiedades anteriores y 
las convenciones de nombres de variables que se deben seguir.
Utilice la edad para calcular el año en que nació un usuario.
Imprima los valores en la consola de un usuario.
 */
public static void main(String []args) {
    System.out.println("Bienvenido a su perfil de usuario");
    Console leer= System.console();

    String nombre = leer.readLine("Escribe tu nombre: ");
    String nacionalidad = leer.readLine("Escribe tu nacionalidad: ");
    String sangre = leer.readLine("Escribe tu tipo de sangre: ");
    String preferenciaLaboral = leer.readLine("Escribe tu preferencia laboral: ");
    String edad = leer.readLine("Ingrese su edad:");
    int edadInt = Integer.parseInt(edad);
    String genero = leer.readLine("Ingrese su género");
    // Se puede usar char pero tuve problematicas  con la entrega de info por parte de Java

    LocalDate anioActual = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("YYYY");
    String anioFormatter = anioActual.format(formato);

System.out.println("Su nombre es: " + nombre +
"Su nacionalidad es" + nacionalidad +
"Su tipo de sangre es :" + sangre+
"su preferencia laboral es : " + preferenciaLaboral+
"Su edad es : " + edadInt+
"Su género es :" + genero+
"Su género es :" + (Integer.parseInt(sangreanioFormatter) - edad));


    }

}