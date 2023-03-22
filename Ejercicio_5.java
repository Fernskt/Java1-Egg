/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */

/**
 *
 * @author sofimai
 */
public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        double raiz = Math.sqrt(num);
     
        
        System.out.println("El doble del numero " + num + " es: " + num*2);
        System.out.println("El triple del numero " + num + " es: " + num*3);
        System.out.println("La raiz cuadrada del numero " + num + " es: " + raiz);
        
    }
}
