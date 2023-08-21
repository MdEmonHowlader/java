import java.util.Scanner;
public class Emon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter data for array: ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.printf("Even: %d\n", arr[i]);
            } else{
                System.out.println("Odd:" +arr[i]);
            }
        }
    }
}
