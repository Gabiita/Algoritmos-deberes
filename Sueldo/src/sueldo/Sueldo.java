/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        int Sueldo = 360;
        double categoria1 = 0.15;
        double categoria2 = 0.10; 
        double categoria3 = 0.08; 
        double categoria4 = 0.07; 
        double sueldoFinal = 0; 
        int opcion=0;
        double categoriaS = 0; 
        
        System.out.println("Ingrese la categoria a conocer");
        System.out.println("categoria 1");
        System.out.println("categoria 2");
        System.out.println("categoria 3");
        System.out.println("categoria 4");
        opcion = Integer.parseInt(scan.nextLine());  
        
        switch (opcion){
                case 1: 
                    System.out.println("Categoria 1");
                    categoriaS=categoria1 * Sueldo;
                    sueldoFinal = Sueldo + categoriaS;
                    break; 
                case 2:
                    System.out.println("Categoria 2");
                    categoriaS=categoria2 * Sueldo;
                     sueldoFinal = Sueldo + categoriaS;
                    break;
                case 3: 
                    System.out.println("Categoria 3");
                    categoriaS=categoria3 * Sueldo;
                    sueldoFinal = Sueldo + categoriaS;
                    break;
                case 4: 
                    System.out.println("Categoria 4");
                    categoriaS=categoria4 * Sueldo;
                    sueldoFinal = Sueldo + categoriaS;
                    break; 
        }
        System.out.println("Sueldo inicial: "+ Sueldo);
        System.out.println("Sueldo aumentado: "+ sueldoFinal);
    }
    
}
