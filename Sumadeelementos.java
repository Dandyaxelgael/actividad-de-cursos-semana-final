/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumadeelementos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Sumadeelementos {

    public static void main(String[] args) {
       
int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("pon 5 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
              
        Arrays.sort(numeros);
        
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("la suma de los 5 numeros es: " + suma);
    }
}