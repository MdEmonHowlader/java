package test3;

public class ArgumentMethode {
    void sum(int a, int b){
        a=45;
        b=46;
       System.out.println(a);
       System.out.println(b);
        
    }
    void sum(double a, double b){
        a=45.76;
        b=65.56;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        ArgumentMethode myObj= new ArgumentMethode();
          myObj.sum(12, 45);
         myObj.sum(12.5, 45.56);

        

     
     
    }
}