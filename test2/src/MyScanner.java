import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter you user name:");
         String userName=myObj.nextLine();
         System.out.println("Enter you Section: ");
         String scetion=myObj.nextLine();
         System.out.println("Enter your Dep: ");
         String dep=myObj.nextLine();
         System.out.println("Enter your Id: ");
         int id=myObj.nextInt();

        
         System.out.println("UserName: " + userName);
          System.out.println("Section: "+ scetion);
          System.out.println("Dep: "+ dep);
          System.out.println("ID: "+ id);
    }
    
}
