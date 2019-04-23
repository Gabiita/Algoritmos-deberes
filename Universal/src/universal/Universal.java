/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Universal {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        String nombreCompleto = new String ();
        String diaS = new String ();
        int arreglo [] = new int [5];
        double sueldo = 280; 
        Boolean asistencia = true;
        int numeroH =0;
        double sueldoFinal =0;
        double valorH =0; 
        int suma=0;
        
        valorH = sueldo/25;
        
     
        
        System.out.println("Ingrese el nombre completo del pasante: ");
        nombreCompleto = scan.nextLine();
        
            for(int i=0;i<5 ;i++){                   
                System.out.println("Ingrese el dia actual: ");
                diaS = scan.nextLine();
                System.out.println("Asistio a trabajar el dia "+diaS+"? :");
                System.out.println("Ingrese True si asistio o False si no lo hizo");
                asistencia = Boolean.valueOf(scan.nextLine()); 
                if (asistencia == true){
                System.out.println("Ingrese el numero de horas:  ");
                numeroH=Integer.parseInt(scan.nextLine());
                arreglo [i]=numeroH;
                suma += arreglo [i];
             
                }else {                             
         System.out.println("Numero de horas trabajadas = 0 ");}                        
    } 
            
            sueldoFinal = valorH*suma;
            System.out.println("Numero de horas trabajadas totales: "+ suma);
            System.out.println("Sueldo final a las "+suma+ " horas es igual a: "+ sueldoFinal);
            
 } 
}
