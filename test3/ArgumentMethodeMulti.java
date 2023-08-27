package test3;

public class ArgumentMethodeMulti {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        ArgumentMethodeMulti myObj= new ArgumentMethodeMulti();

        myObj.sum(12.50, 24.435);
        myObj.sum(12, 22);
    }
}
