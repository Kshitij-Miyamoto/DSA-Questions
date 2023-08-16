import java.util.Scanner;

public class Q47 {
    // Second order elements in an array
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible value
        int max2 = Integer.MIN_VALUE; // Initialize max2 with the smallest possible value
        int min = Integer.MAX_VALUE; // Initialize min with the largest possible value
        int min2 = Integer.MAX_VALUE; // Initialize min2 with the largest possible value

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }

            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] > min) {
                min2 = arr[i];
            }
        }

        System.out.println("Second largest element: " + max2);
        System.out.println("Second smallest element: " + min2);
    }
}