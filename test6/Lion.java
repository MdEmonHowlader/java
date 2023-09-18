package test6;
import java.util.*;
public class Lion extends Animal {
    String name ="Lion";

    Animal g =new Animal();
    
    public void makeSound() {

        g.sleep();
        System.out.println(name+ " Sound: Roar!"); // Specific sound for a lion
    }
   

}
