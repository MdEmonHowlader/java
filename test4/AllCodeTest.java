package test4;

import java.util.Scanner;

public class AllCodeTest{
    public static void main(String[] args) throws Exception {
        double sum = 0;
        Scanner emon = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter your CGPA: ");
            double cgpa = emon.nextDouble();
            sum = sum + cgpa;
        }

        double average = sum / 5;
        System.out.println("My Average: " + average);

        if (average >= 80) {
            System.out.println("CGPA: 4");
        } else if (average >= 70) {
            System.out.println("CGPA: 3.75");
        } else if (average >= 60) {
            System.out.println("CGPA: 3.50");
        } else if (average >= 50) {
            System.out.println("CGPA: 3.25");
        } else if (average >= 40) {
            System.out.println("CGPA: 3.00");
        } else {
            System.out.println("Fall");
        }
    }
}

