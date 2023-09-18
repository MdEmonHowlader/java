package test6;

public class Zoo_management {
    public static void main(String[] args) {
        System.out.println("Enter your Animal Name: ");
        Lion lion=new Lion();
        Elephant elephant= new Elephant();
        Animal name=new Animal();
        name.eat();
        name.makeSound();
        lion.makeSound();
        elephant.makeSound();

    }
}
