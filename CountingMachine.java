/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingmachine;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class CountingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        
        System.out.print("Give me a number ");
        userInput = keyboard.nextInt();
        
        for(int i=0; i <= userInput; i++){
        
            System.out.println(i);
        }
       
    }
    
}
