package com.generation.firstproject;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproject.models.Autor;
import com.generation.firstproject.models.Libro;
import com.generation.firstproject.models.ObjetoRandom;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		/*
		 * //creacion de objeto auto
		 * Auto auto = new Auto(3.5f, "rojo", "abcs23", "de auto", "led");
		 * Perro perro1 = new Perro(1,"dobi","liso","Pastor Aleman", true);
		 * 
		 * //imrpimir en cosola con metodo tostring
		 * System.out.println(auto.toString());
		 * System.out.println(perro1.toString());
		 * perro1.ladrar();
		 * String truco = perro1.truco("da la pata");
		 * System.out.println(truco);
		 * System.out.println(perro1.adopcion());
		 * perro1.setPelaje("Rizado");
		 * System.out.println(perro1.toString());
		 * 
		 * String nombrePerro = perro1.getNombre();
		 * int idPerro = perro1.getId();
		 * System.out.println(idPerro +" "+ nombrePerro );
		 * 
		 * ObjetoRandom obj = new
		 * ObjetoRandom(1,"frederick","cid",27,"frederickcid@gmail.com", 45324567);
		 * System.out.println(obj.anioNacimiento());
		 * System.out.println(obj.toString());
		 * String nombre = obj.getNombre();
		 * String apellido = obj.getApellido();
		 * System.out.println(nombre + " " + apellido);
		 */
		/*
		 * ///inicializar variables
		 * String nombre, apellido, email;
		 * int edad, numero, i=1, opc = 1;
		 * ///Crear Arralylist para guardar los objetos que se crearan
		 * ArrayList <ObjetoRandom> al = new ArrayList<ObjetoRandom>();
		 * ///inicializamos ciclo while para agregar una cantidad indefinida de objetos
		 * ///Hasta que el usuario ingrese el dato deseado para parar el bucle
		 * while (opc != 0) {
		 * ///inicializamos algun leetor de datos in
		 * try (Scanner sc = new Scanner(System.in)) {
		 * ///pedimos los datos al usuario
		 * System.out.println("ingrese el nombre");
		 * ///reemplazamos la variable que el usuario ingreso a la variable que le dimos
		 * el nombre
		 * nombre = sc.next();
		 * System.out.println("ingrese el apellido");
		 * apellido = sc.next();
		 * System.out.println("ingrese el edad");
		 * edad = sc.nextInt();
		 * System.out.println("ingrese el email");
		 * email = sc.next();
		 * System.out.println("ingrese el numero Telefonico");
		 * numero = sc.nextInt();
		 * ///Creamos un nuevo objeto adentro del bucle para reemplazar la misma
		 * variable x veces
		 * ///reemplazamos los datos necesarios , con las variables que hicimos que
		 * ingresara el usuario
		 * ///i es un contador autoincrementable el cual le da in id al objeto que estoy
		 * creando para poder indentificar
		 * ///no solo con nombre si no con id el cual sera un dato unico;
		 * ObjetoRandom obj = new ObjetoRandom(i,nombre,apellido,edad,email,numero);
		 * System.out.println(
		 * "------------------------------------------------------------");
		 * ///mostramos el objeto creado con los datos del usuario
		 * System.out.println(obj.toString());
		 * System.out.println(
		 * "------------------------------------------------------------");
		 * ///de un principio era presionar enter para que funcionara y continuara pero
		 * con vsCode no se puede
		 * ///aqui el usuario ingresa cualquier numero para continuar y si ingresa 0 se
		 * para el bucle
		 * System.out.
		 * println("para salir ingrese 0 o ingrese cualquier numero para continuar");
		 * opc = sc.nextInt();
		 * ///agregamos objeto creado al arraylist
		 * al.add(obj);
		 * }catch (Exception e) {
		 * System.out.println(e);
		 * }
		 * ///se incrementa en 1 el contador para el siguiente objeto creado
		 * i++;
		 * }
		 * ///recorremos todos los objetos dentro del arraylist para mostrarlos en
		 * pantalla , se almacenaran todos los objetos
		 * ///creados por el usuario , se mostrar este ejempo con el toString(); para
		 * mostrar un orden de los objetos
		 * ///recorremos e imprimimos de 1 en 1 con el forEach
		 * for (Object object : al) {
		 * System.out.println("-----------------------------------");
		 * System.out.println(object);
		 * }
		 */

		///se puede crear el objeto autor que absorbe un autor el cual ya tiene lois parametros  y luego en el constructor agregar el objeto creado
		///mejor opcion que base de datos
		Autor autor1 = new Autor(1,"fre","wea");
		Libro libro1 = new Libro(1,2, "libro", autor1);
		System.out.println(libro1.toString());


		///opcion agregando los parametros directos
		/* Autor autor1 = new Autor(1,"fre","wea");
		Libro libro1 = new Libro(1,"frederic","cid",1,123,"libro");
		Libro libro2 = new Libro(autor1.get_id(),autor1.get_nombre(),autor1.get_apellido(),2,321,"la mama de la mama");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString()); */
	}
}
