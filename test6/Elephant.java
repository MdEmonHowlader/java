package test6;
public class Elephant extends Animal {
    public void makeSound() {
        String name ="Elephant";
        System.out.println(name+ " Sound: Trumpet!" ); 
    }

    public static void main(String[] args) {
         Elephant e= new Elephant();
        e.eat("Elephant");
        System.out.println("Elephant eat name: The Grass" );
         String name1 ="Elephant";
        System.out.println(name1 + " Sleep time: 5:00pm ");
        Animal e1= new Animal();
        e1.makeSound();
        e.makeSound();
        
    }
}
