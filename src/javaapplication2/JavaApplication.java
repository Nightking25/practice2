/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.*;

/**
 *
 * @author cstuser
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = "";
        int choice;
        
        System.out.println("Please chose one of the options; ");
        System.out.println("(1) Happy birthday ");
        System.out.println("(2) Good morning");
        System.out.println("(3) Cheers ");
        System.out.println("(4) bye ");
        System.out.println("(5) hi ");
        
        choice = sc.nextInt();
        
        if (choice == 1){
            greeting = "Happy birthday";
        } else if (choice == 2) {
           greeting = "Good Morning"; 
        } else if (choice == 3) {
           greeting = "cheers"; 
        } else if (choice == 4) {
           greeting = "bye"; 
        } else if (choice == 5) {
           greeting = "hi"; 
        } else {
           greeting = "INVALID"; 
        } 
        System.out.println("The greeting you selected was..." + greeting);
        
        choice = sc.nextInt();
        switch (choice){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "b";
                break;
            case 3:
                greeting = "c";
                break;
            case 4:
                greeting = "d";
                break;
            case 5:
                greeting = "e";
                break;
            default: 
                greeting = "default";
        }
        System.out.println("The greeting you selected was..." + greeting);
    }
    
}
