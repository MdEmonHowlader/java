package test3;
// import java.utli.Math;
import java.util.ArrayList;
import java.util.Scanner;


public class MathAll {
    public static void main(String[] args) {
         Scanner myObj= new Scanner(System.in);
        int n; 
        n=myObj.nextInt();
        myObj.nextLine();
         String[] name= new String[n];
         for(int i=0; i<n; i++){
            name[i]=myObj.nextLine();

         }
         for(int i=0; i<n; i++){
            System.out.println(name[i]);
         }


        


    }
}
