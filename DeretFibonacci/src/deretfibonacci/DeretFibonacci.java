/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretfibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class DeretFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner show = new Scanner(System.in);
        
        int n;
        int fib[];
        int jumlah = 0;
        
        
        System.out.print("Input :  ");
        n = show.nextInt();
        fib = new int[n];
         
        fib[0] = 0;
        fib[1] = 1;
         System.out.println("output : ");
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }     
        for (int i = 0; i < n; i++) {
            jumlah = jumlah + fib[i];
        }
 
         System.out.println(jumlah);
    }
    
}
