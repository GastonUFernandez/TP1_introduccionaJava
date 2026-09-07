/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico1;
//6. Manejar conversiones de tipo y división en Java.
//a. Crea una clase llamada Ejercicio_06.
//b. Escribe un programa que divida dos números enteros ingresados por el
//usuario.
//c. Modifica el código para usar double en lugar de int y compara los
//resultados.
import java.util.Scanner;
/**
 *
 * @author gastonfernandez
 */
public class Ejercicio_06 {
    public static void main(String[] args) {
        // Declaración de variables para almacenar las divisiones
        int division;
        double division2;
        
        // Inicializo el objeto Scanner para la lectura de datos
        Scanner sc = new Scanner(System.in);
        
        // Solicito y leo dos números enteros
        System.out.println("Ingrese un número entero: ");
        int numero1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese otro número entero: ");
        int numero2 = Integer.parseInt(sc.nextLine());
        
        // Realizo y muestro la división de enteros (resultado sin decimales)
        division = numero1 / numero2;
        System.out.println("El resultado de la división es: " + division);        
        
        // Solicito y leo dos números decimales
        System.out.println("Ingrese un número decimal: ");
        double flotante1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese otro número decimal: ");
        double flotante2 = Double.parseDouble(sc.nextLine());
        
        // Realizo y muestro la división con decimales
        division2 = flotante1 / flotante2; 
        System.out.println("El resultado de la división es: " + division2); 
    }
}
