/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Palindromo {

    public static void main(String[] args) {
           
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("pon una palabra: ");
            String cadena = scanner.nextLine();
            boolean resultado = esPalindromo(cadena);
            if (resultado) {
                System.out.println("si es un palindromo");
            } else {
                System.out.println("no es un palindromo");
            }
            
        }
    }
    
    public static boolean esPalindromo(String cadena) {
        
        String cadenaProcesada = cadena.replaceAll("\\s+", "").toLowerCase();
               
        StringBuilder sb = new StringBuilder(cadenaProcesada);
               
        String cadenaInvertida = sb.reverse().toString();
              
        return cadenaProcesada.equals(cadenaInvertida);
    }
}
