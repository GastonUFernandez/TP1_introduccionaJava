/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico1;
//7. Corrige y analiza un código con errores.
//a. Crea una clase llamada Ejercicio_07.
//b. Corrige el siguiente código para que funcione correctamente.
//c. Explica (puedes hacerlo mediante comentarios en el mismo código) qué
//error tenía la lectura de datos y cómo lo solucionaste.
//import java.util.Scanner;
//public class ErrorEjemplo {
//public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
//System.out.print("Ingresa tu nombre: ");
//String nombre = scanner.nextInt(); // ERROR
//System.out.println("Hola, " + nombre);
//}
//}
import java.util.Scanner;
/**
 *
 * @author gastonfernandez
 */
public class Ejercicio_07 { // renombro la clase.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextLine(); // ERROR, cambio nextInt por nextLine
// ya que nombre es un string y no un entero.
System.out.println("Hola, " + nombre);
}
}
