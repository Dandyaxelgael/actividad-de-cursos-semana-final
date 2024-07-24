/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximocomoundivisor;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */

public class Maximocomoundivisor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("coloca un numero entero: ");
            int numero1 = scanner.nextInt();
            System.out.print("coloca otro numero entero: ");
            int numero2 = scanner.nextInt();
            
            int resultado = maximoComunDivisor(numero1, numero2);
            
            System.out.println("el maximo comun divisor de  " + numero1 + " y " + numero2 + " es: " + resultado);
        } 
    }
    
    public static int maximoComunDivisor(int a, int b) {
        a = Math.abs(a); 
        b = Math.abs(b); 
        while (b != 0) {
            int temp = b;
            b = Math.floorMod(a, b);
            a = temp;
        }
        return a;
    }
} ;
    

