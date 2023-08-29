package test4;
//Ans to Q no-1;
import java.util.*;

public class One{
    static int myMethod(int s, int c){
        return s+c;
    }
    static double myMethod(double a, double b, double d){
        return a+b+d;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      int c=sc.nextInt();
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double d=sc.nextDouble();
       int myNum= myMethod(s,c);
       double myNum2=myMethod(a, b, d);
         System.out.println("Int: " + myNum);
         System.out.println("Double: "+ myNum2);

      
    }
}
