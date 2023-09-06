package test4;


//Ans to Q no-3;
import java.util.*;

public class Three{
    
        private String id;
        private String name;
        private double cgpa;
      
       public static void insert_Record(){
       Scanner sc=new Scanner(System.in);
       Three maruf=new Three();
       maruf.id=sc.nextLine();
       maruf.name=sc.nextLine();
       maruf.cgpa=sc.nextDouble();
       maruf.display_Record();

       }
       public void display_Record(){
        
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.cgpa);
       }

        public static void main(String[] args) {
         Three maruf1= new Three();
         maruf1.insert_Record();
         maruf1.display_Record();
         
        }
}
  
