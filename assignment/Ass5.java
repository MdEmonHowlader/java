package assignment;
import java.util.*;
public class Ass5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
    
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
    
           
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array[i];
            }
            System.out.println("Sum of the elements in the array: " + sum);
    }
    
}
