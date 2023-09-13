package test4;

public class Construtor {
    String name;
    String dep;
    String sec;
    int id;

    public Construtor(){
        this.name="Emon";
        this.dep="CSE";
        this.sec="63_Q";
        this.id=1732;
    }
    public static void main(String[] args){
        Construtor infrom=new Construtor();
        System.out.println("Your name: "+ infrom.name);
        System.out.println("Your dep: "+ infrom.dep);
        System.out.println("Your Section: "+ infrom.sec);
        System.out.println("Your ID: "+ infrom.id);
    }
    
}
