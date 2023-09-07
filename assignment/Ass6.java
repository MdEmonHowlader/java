package assignment;

public class Ass6 {
    public static void main(String[] args) {
        int[] array = { 5, 12, 9, 23, 8, 17, 42, 3 };

        int max = array[0]; 
        int min = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
            if (array[i] < min) {
                min = array[i]; 
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}

