package test4;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inputData=sc.nextInt();
        int inputArray[]= new int[inputData];
        System.out.println("Enter your Total number: ");

        for(int i=0; i<inputData; i++){
            inputArray[i]=sc.nextInt();
            
        }
        System.out.println("Enter your array Data: ");
        for(int i=0; i<inputData; i++){
            Arrays.sort[inputArray];
            System.out.println(inputArray[i]);
        }
    }
}
