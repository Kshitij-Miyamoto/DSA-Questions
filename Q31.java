import java.util.Scanner;

public class Q31 {
    // Decimal to Binary Conversion
    static void convert() {
        System.out.println("Enter a decimal type number, i.e base 10: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int binary = 0;
        int place = 1; // Represents the current place value (1, 2, 4, 8, ...)

        while (num != 0) {
            int bit = num % 2; // Get the current binary digit (0 or 1)
            binary = binary + bit * place; // Update the binary value
            num /= 2; // Divide num by 2 to continue conversion
            place = place*10; // Move to the next place value (10s, 100s, 1000s, ...)
        }

        System.out.println("Binary representation: " + binary);
    }

    public static void main(String[] args) {
        convert();
    }
}



