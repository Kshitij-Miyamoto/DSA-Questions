import java.util.Scanner;

public class Q22 {
    //Write a function that returns all prime numbers between two given numbers.
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void prime() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        prime();
    }
}







