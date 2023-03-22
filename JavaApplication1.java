/*
 Escribir un programa que pida dos números 
enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  	int resultado;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otr número");
        int num2 = leer.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
             
}
}
