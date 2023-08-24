package test3;

//import java.util.*;


// public class Emon {
//     public static void main(String[] args) {
//         int a=12;
//         int b=34;
//         double c=52.4;

//         System.out.println(Math.max(a, b));
//         System.out.println(Math.min(a, b));
//         System.out.println(Math.sqrt(a));
        
//     }
    
// }

 
import java.util.Scanner;
 
public class Emon
{
 
public String name;
 
private int marks;
 
public Emon (String stuName) {
name = stuName;
}
public void setMarks(int stuMar) {
marks = stuMar;
}
 
// This method prints the student details.
public void printStu() {
System.out.println("Name: " + name );
System.out.println("Marks:" + marks);
}
 
public static void main(String args[]) {
Emon StuOne = new Emon("Emon1");
Emon StuTwo = new Emon("Emon2");
Emon StuThree = new Emon("Emon3");
 
StuOne.setMarks(98);
StuTwo.setMarks(89);
StuThree.setMarks(90);
 
StuOne.printStu();
StuTwo.printStu();
StuThree.printStu();
 
}
}
