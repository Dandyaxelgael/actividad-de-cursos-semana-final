/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizcuadrada;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Raizcuadrada {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("coloca un numero: ");
            double numero = scanner.nextDouble();
            
            
            if (numero < 0) {
                System.out.println("no se puede calcular, es negativo burro.");
            } else {
                
                double raizcuadrada = Math.sqrt(numero);
                
                
                System.out.println("la raiz cuadrada " + numero + " es: " + raizcuadrada);
            }
        }
    }
}
