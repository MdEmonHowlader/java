package test4;
//Ans to Q no-3;
import java.util.*;

public class UmlLabTest{
    
        private String id;
        private String name;
        private double cgpa;
      
       public static void insert_Record(){
       Scanner sc=new Scanner(System.in);
       UmlLabTest emon=new  UmlLabTest();
       emon.id=sc.nextLine();
       emon.name=sc.nextLine();
       emon.cgpa=sc.nextDouble();
       emon.display_Record();

       }
       public void display_Record(){
        
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.cgpa);
       }

       
        public static void main(String[] args) {
          UmlLabTest emon1= new  UmlLabTest();
         emon1.insert_Record();
         emon1.display_Record();
         
        }
       
        
    
    
}
  