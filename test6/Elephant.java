package test6;

public class Elephant extends Animal {
    String name ="Elephant";
    Animal e= new Animal();

    public void makeSound() {
        e.sleep();
        System.out.println(name+ " Sound:  Trumpet!" ); 
    }
}
