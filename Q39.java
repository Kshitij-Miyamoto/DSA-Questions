import java.util.Scanner;

public class Q39 {
    // Problem any base with any base addition.
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();

        while(num1 != 0){
            int dig1 = num1%base;
            num1 = num1/base;
            System.out.println(dig1);

        while(num2 != 0){
            int dig2 = num2%base;
            num2 = num2/base;
            System.out.println(dig2);
        }
    }

    }
}

