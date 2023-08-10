import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        //No. of digits
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // Enter the number to be rotated.
        int k = in.nextInt();   // Number of rotations.
        int temp = num;
        int nod = 0;

        while (temp > 0) {
            temp = temp / 10; //This block of code is just being used to calculate the number of digits.
            nod++;
        }

        int div = (int) Math.pow(10, nod - k);
        int q = num / div;
        int r = num % div;
        int rot = r * (int) Math.pow(10, k) + q;

        System.out.println(rot);
    }
}