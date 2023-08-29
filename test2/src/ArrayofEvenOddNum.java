import java.util.*;

public class ArrayofEvenOddNum {
    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n=inputData.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter data for array: ");
        for(int i=0; i<n; i++){
            arr[i]=inputData.nextInt();
        }for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                System.out.println("Ëven = "+ arr[i]);
            }else{
                System.out.println("odd = "+ arr[i]);
            }
        }
    }
}
