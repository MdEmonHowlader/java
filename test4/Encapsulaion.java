package test4;

public class Encapsulaion {
    public static void main(String[] args) {
        Person P1= new Person();
        P1.setAge(45);
        P1.setName("Md.Emon");
        System.out.println("Name: " + P1.getName());
        System.out.println("Age: " + P1.getAge());
    }
}
