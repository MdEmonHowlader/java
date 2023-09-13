package test4;

import java.util.Scanner;

public class ArrayUserData {
    
   public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        int n;
        // String name=myObj.nextLine();
        // System.out.println("Enter your name:"+ name);
         n=myObj.nextInt();  
         System.out.println("Enter your total number:");
        int arra[]=new int[n];
     
         System.out.println("Your element data: ");
        for(int i=0; i<n; i++){
               
                arra[i]=myObj.nextInt();
                 
               
        }for(int i=0; i<n; i++){
                
                System.out.println("User input data: "+arra[i]);

        }
     
         
   


   }
    
}
