package test6;
public class Animal {
    private String name;
    public void eat(String name){
        System.out.println("Animal name: "+ name);
    }
    public void sleep(String name2){
        System.out.println(name2 +" Sleep time: 10:00pm");
    }
    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
