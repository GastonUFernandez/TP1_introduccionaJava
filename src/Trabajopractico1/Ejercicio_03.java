/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico1;
//3. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
//los muestre en pantalla. Usa Scanner para capturar los datos.
//a. Crea una clase llamada Ejercicio_03.
//b. Usa la clase Scanner para capturar los datos ingresados por el usuario.
import java.util.Scanner;

/**
 *
 * @author gastonfernandez
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        imprimirsimbolo('x',5);
        // Inicializo el objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);
        
        // Solicito y guardo el nombre del usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        // Solicito la edad y la convierto de texto a un número entero
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        // Muestro en pantalla los datos ingresados
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);       
    }
    static void imprimirsimbolo(char simbolo, int veces){
        for (int i= 0; i < veces; i++){
            System.out.println("simbolo");
        }
        System.out.println();
    }   
}
