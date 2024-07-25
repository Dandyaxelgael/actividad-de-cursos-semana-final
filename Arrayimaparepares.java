/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayimaparepares;

/**
 *
 * @author Dandycool
 */

import java.util.Scanner;
public class Arrayimaparepares {


    public static void main(String[] args) {
        
            
        int[] numeros = new int[10];
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("pon 10 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

       
        int countadorpares = 0;
        int contadorimpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                countadorpares++;
            } else {
                contadorimpares++;
            }
        }

       
        System.out.println("numeros pares: " + countadorpares);
        System.out.println("numero impares: " + contadorimpares);
    }
}

