/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico1;
//4. Escribe un programa que solicite dos números enteros y realice las siguientes
//operaciones:
//a. Crea una clase llamada Ejercicio_04.
//b. Suma
//c. Resta
//d. Multiplicación
//e. División
//f. Muestra los resultados de todas las operaciones en la consola.
import java.util.Scanner;

/**
 *
 * @author gastonfernandez
 */
public class Ejercicio_04 {
    public static void main(String[] args) {
        // Inicializo el objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);
        
        // Pido y leo el primer número entero
        System.out.println("Ingrese un número entero: ");
        int n1 = Integer.parseInt(sc.nextLine());
        
        // Pido y leo el segundo número entero
        System.out.println("Ingrese otro número entero: ");
        int n2 = Integer.parseInt(sc.nextLine());
        
        // Muestro los resultados de las operaciones matemáticas básicas
        System.out.println("Suma: "+ (n1 + n2));
        System.out.println("Resta: "+ (n1 - n2));
        System.out.println("Multiplicación: "+ (n1 * n2));
        System.out.println("División: " + (n1 / n2));   

    }   
}
