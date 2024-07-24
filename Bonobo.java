/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bonobo;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Bonobo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa una palabra: ");
            String texto = scanner.nextLine();
            
            
            System.out.print("ingresa lo que vas a remplazar: ");
            char caracterOriginal = scanner.nextLine().charAt(0);
            
            
            System.out.print("que lo va remplazar: ");
            char nuevoCaracter = scanner.nextLine().charAt(0);
            
            
            String palabramodificada = texto.replace(caracterOriginal, nuevoCaracter);
            
            
            System.out.println("palabra modificado: " + palabramodificada);
        }
    }
}
