package test3;

public class Polymorphism {
    static int myMethod(int x, int y){
        return x+y;
    }
    static double myMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        int myNumber=myMethod(34, 2);
        double myNumber2=myMethod(4.4, 6.7);
        System.out.println("Int: " + myNumber);
        System.out.println("Double: "+ myNumber2);
    }
    
}
