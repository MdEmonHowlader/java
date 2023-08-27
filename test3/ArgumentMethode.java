package test3;

public class ArgumentMethode {
    void sum(int a, int b){
       System.out.println(a+b);
        
    }
    void sum(double a, double b){
      System.out.println(a+b);

    }
    public static void main(String[] args) {
        ArgumentMethode myObj= new ArgumentMethode();
         myObj.sum(12, 45);
         myObj.sum(12.45, 45.89);

     
     
    }
}