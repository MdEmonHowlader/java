package test6;
import java.util.*;

public class Animal {
    private String name;

    public void eat(){
        Animal nam =new Animal();
        Scanner sc=new Scanner (System.in);
        nam.name=sc.nextLine();
        System.out.println("Animal name: "+nam.name);
        System.out.println("Eat name: Taste");

    }
    public void sleep(){
        Animal n= new Animal();
        n.eat();
        System.out.println(" Sleep: 4:00pm");

    }
    public void makeSound(){
        System.out.println("Some generic animal sound");

    }
    

    
}
