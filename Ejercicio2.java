/*
Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio2 {
    
     public static void main(String[] args) {
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese su nombre por favor");
         
         String nombre = leer.nextLine();
         
         System.out.println("Bienvenido " + nombre);
     }
    
}
