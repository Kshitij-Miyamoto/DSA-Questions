
import java.util.Scanner;

public class Q39a {
    public static void main(String[] args) {
            System.out.println("Enter a number ");
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int base = in.nextInt();
            int place = 1;
            int c = 0;
            int r = 0;



            while(num1 > 0 || num2 > 0 || c > 0){
                int dig = num1%10;
                 num1 = num1/10;
                int dig1 = num2%10;
                num2 = num2/10;
                int sum = dig + dig1 + c;
                 c = sum/base; //Because C is the carry forward and it is the quotient hence just division is used.
                 sum = sum%base;
                 r = r + sum*place;
                place = place*10;
            }
        System.out.println(r);
        }

    }

