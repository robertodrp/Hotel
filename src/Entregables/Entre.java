/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregables;

import java.util.Scanner;

/**
 *
 * @author Principal
 */
public class Entre {
    public static boolean validarRespuesta(int min, int max) {
    
        Scanner sc = new Scanner(System.in);
        
        while(entre()) {
            sc.next();
            System.out.println("Opción invalida");
            System.out.println("Intenta denuevo porfavo");
        }
        
        boolean respuesta = entre();
        
        
        while(respuesta < min || respuesta > max) {
            
           
            System.out.println("Opción invalida");
            System.out.println("Intenta denuevo porfavor");
            
            while(entret()) {
                sc.next();
                System.out.println("Opción invalida");
                System.out.println("Intenta denuevo porfavo");
            }
            respuesta = entre();
        }
        System.out.println("Tu respuesta fue: " + respuesta + "\n");
        return respuesta;
    } 

    private static boolean entre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean entret() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    


