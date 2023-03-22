/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java
*/

/**
 *
 * @author sofimai
 */
public class Ejercicio_3 {
    public static void main(String[] args){
    String mayus, minus;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        mayus = frase.toUpperCase();
        minus = frase.toLowerCase();
        
        System.out.println("La frase en mayusculas es: " + mayus);
        System.out.println("La frase en minusculas es: " + minus);
}
}
