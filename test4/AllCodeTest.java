package test4;
//Ans to Q no-3;
import java.util.*;

public class AllCodeTest{
    
        private String id;
        private String name;
        private double cgpa;
      
       public static void insert_Record(){
       Scanner sc=new Scanner(System.in);
       AllCodeTest emon=new AllCodeTest();
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
         AllCodeTest emon1= new AllCodeTest();
         emon1.insert_Record();
         emon1.display_Record();
         
        }
       
        
    
    
}
    
