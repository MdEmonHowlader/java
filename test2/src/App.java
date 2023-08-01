import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double sum=0 ,number=0;
        Scanner emon=new Scanner(System.in);
       for(int i=1; i<5; i++){
        System.out.println("Enter you number: ");
       double cgpa=emon.nextDouble();
        sum =sum+cgpa;
       }
        double Average=sum/5;
       System.out.println("My Average: "+ Average );
       if(Average>=80){
        System.out.println("CGPA : 4");
       }else if(75>=Average && Average>=70){
        System.out.println("Cgpa: 3.75");
       }else if(65>=Average && Average>=60){
        System.out.println("Cgpa: 3.50");
       }else if(55>=Average && Average>=50){
        System.out.println("Cgpa: 3.25");
       }else if(45>=Average && Average>=40){
        System.out.println("Cgpa: 3.00");
       }else{
        System.out.println("Fall");
       
       }
    }
}
