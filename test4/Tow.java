package test4;
//Ans to Q no-2;
import java.util.*;

public class Tow{
    public static void main(String[] args) {
           int a,b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int e=Math.max(a, b);
    Math.max(e,c);
    Math.min(e,c);
    System.out.println("Max: "+Math.max(e,c));
    System.out.println("Min: "+ Math.min(e,c));
    }
 
    
}
