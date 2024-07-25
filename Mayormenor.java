/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayormenor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Mayormenor {

    public static void main(String[] args) {
       int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("pon 8 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
     
        Arrays.sort(numeros);
      
        int menor = numeros[0];
        int mayor = numeros[numeros.length - 1];

        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);
    }
}