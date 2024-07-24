/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertiramayusculas;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Convertiramayusculas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder textoCompleto = new StringBuilder();
            while (true) {
                System.out.print("coloca una palabra (o nada para finalizar): ");
                String input = scanner.nextLine();
                
                if (input.trim().isEmpty()) {
                    break;
                }                               
                String palabraenmayusculas = input.toUpperCase();
                               
                textoCompleto.append(palabraenmayusculas).append(" ");
            }   
            System.out.println("texto en mayusculas: " + textoCompleto.toString().trim());
           
        }
    }
}
    

