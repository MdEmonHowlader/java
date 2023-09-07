package assignment;

import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        
        int[] numbers = new int[N];

       
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.println("Elements in the array:");
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 

        
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < N; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

       
    }
}

