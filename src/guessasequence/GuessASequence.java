/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessasequence;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class GuessASequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int[] ar=new int[6];
        for (int i=0;i<6;i++) {
            ar[i]=rand.nextInt(3);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's start guessing");
        
        for (int i=0;i<6;i++) {
            guessANumber(ar[i],sc);
            System.out.format("number %d is ok.\n",i);
        }
        System.out.println("Done.");
    }

    private static void guessANumber(int number, Scanner sc) {
        int g;
        do {
            System.out.print("Please input a number:");
            g=sc.nextInt();
        } while (g!=number);
        
    }
    
}
