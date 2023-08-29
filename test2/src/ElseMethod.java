public class ElseMethod {
    static void checkAge(int age){
        if(age<=19){
            System.out.println("You are old 18");

        }else{
            System.out.println("You are not old 18");
        }
    }
    public static void main(String[] args) {
      checkAge(20);
    }
}
