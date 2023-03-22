/*
 Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio4 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados a convertir");
        
        float grados = leer.nextFloat();
        
        float farenheit = 32 + (9*grados/5);
        
        System.out.println("Los grados centigrados ingresados equivalen a " + farenheit + " Farenheit");
        
    }
    
}
