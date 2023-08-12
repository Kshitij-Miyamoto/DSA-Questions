import java.util.Scanner;

public class Q39 {
    // Problem any base with any base addition.
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        int rv = 0;

       int c = 0;
       int p = 1;
        while(num1 > 0 || num2 > 0 || c > 0 ){
            int dig1 = num1%10;
            num1 = num1/10;
            int dig2 = num2%10;
            num2 = num2/10;
            int dig = dig1 + dig2 + c;
            c = dig/base;
            dig = dig%base;
            rv = rv + dig*p;
            p = p*10;

        }
        System.out.println(rv);
    }

    }


