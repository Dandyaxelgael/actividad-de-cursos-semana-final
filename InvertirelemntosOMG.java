/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirelemntosomg;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class InvertirelemntosOMG {

    public static void main(String[] args) {
         int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("pon 6 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
      
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println("invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}
