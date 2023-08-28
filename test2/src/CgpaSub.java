import java.util.*;
public class CgpaSub {
    public static void main(String[] args){
        double sum=0;
        Scanner myObj=new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("Enter you number: ");
            double cgpa=myObj.nextDouble();
            sum =sum + cgpa;
    
        }
        double average=sum/5;
        System.out.println("Your Avreage: "+ average);

        if(average>=80){
            System.out.println("CGPA : 4");
        }else if(average>=70){
            System.out.println("CGPA: 3.75");
        }
        else if(average>=65){
            System.out.println("CGAP: 3.50");
        }else if(average>=60){
            System.out.println("CGPA: 3.25");
        }
        else if(average>=55){
            System.out.println("CGPA: 3.00");
        }else if(average>=50){
            System.out.println("CGPA: 2.5");
        }else if(average>=40){
            System.out.println("CGPA: 2.25");

        }else{
            System.out.println("Fall");
        }

    }    
}
