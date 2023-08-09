import java.util.Scanner;

public class Q13 {
        public static int diff(int n) {
            //Subtract the Product and Sum of Digits of an Integer
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int product = 1;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                product = product * digit;
                sum = sum + digit;
                num /= 10;
            }
            int diff = product - sum;
            return diff;
        }

        public static void main(String[] args) {
            Q13 solution = new Q13(); // Create an instance
            int z = solution.diff(254);
            System.out.println(z);
        }
        }

