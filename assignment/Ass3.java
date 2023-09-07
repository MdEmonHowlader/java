package assignment;

import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        Scanner emon= new Scanner(System.in);

        double radius = emon.nextDouble();
        double area= Math.PI*Math.pow(radius, 2);
        System.out.println(area);

    }
}
