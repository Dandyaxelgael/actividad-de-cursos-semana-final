/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosemana3;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Proyectosemana3 {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in); {
            System.out.print("coloca un numero entero: ");
            int numero = scanner.nextInt();
            boolean resultado = esPrimo(numero);
            if (resultado) {
                System.out.println("el numero que puisite " + numero + " es primo");
            } else {
                System.out.println("el numero que puisite " + numero + " no es primo.");
            }
            
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int limite = (int) Math.sqrt(numero); 
        for (int i = 2; i <= limite; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    
