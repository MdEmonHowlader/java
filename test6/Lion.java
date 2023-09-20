package test6;
public class Lion extends Animal {
    String name ="Lion";
    
    public void makeSound(){
        System.out.println(name+ " Sound: Roar!"); 
    }
   public static void main(String[] args) {
        Lion go =new Lion();
        go.eat("Lion");
        System.out.println("Lion eat name: Taste");
         go.sleep("Lion");
        Animal e1= new Animal();
        e1.makeSound();
        go.makeSound();
       
   }
}
