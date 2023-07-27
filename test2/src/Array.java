import java.util.ArrayList;


public class Array {
    public static void main(String[] args) {
        int[] marks = { 23, 23, 45, 12 };
        int[][] finalMarks = { { 23, 12, 5, 6 }, { 29, 65, 48, 35 } };
        for (int i = 0; i < finalMarks.length; i++) {
            for (int j = 0; j < finalMarks[i].length; j++) {
                System.out.println(finalMarks[i][j]);
            }

        }
        String name = "Emon";

        // System.out.println("Hello " + name.toUpperCase().length());

        // Find the lowest value of x and y
        System.out.println(Math.min(3, 2));

        // The square root of x
        System.out.println(Math.sqrt(56));

        int x = 10;
        int y = 9;
        System.out.println(x >= y);
        



    }

}