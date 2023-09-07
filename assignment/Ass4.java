package assignment;
import java.util.*;
public class Ass4 {
    public static void main(String[] args) {
        Scanner emon =new Scanner(System.in);

    int student=emon.nextInt();
    String grade;

    if(student>=80){
        grade="A+";

    }else if(student>=70){
        grade="A";
    }else if(student>=60){
        grade="A-";
    }else if(student>=50){
        grade="B";
    }else if(student>=40){
        grade="C";

    }else{
        grade="F";
    }
    System.out.println("Grade: "+ grade);
        
    }
}
