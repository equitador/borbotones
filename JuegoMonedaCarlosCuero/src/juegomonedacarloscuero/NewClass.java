/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomonedacarloscuero;

import java.util.Arrays;

/**
 *
 * @author SUAZA
 */
public class NewClass {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,1,3,1,5};
        
        for (int x=0;x<a1.length;x++) {
            if (a1[x] == a2[x]) {
                System.out.println("El número " + a1[x] + " en la posición " + x);
            }
        }
    
    }
}


