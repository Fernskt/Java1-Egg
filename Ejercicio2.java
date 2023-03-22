/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
