import java.util.Scanner;

public class Q41 {
    //Any base multiplication
    public static void main(String[] args) {
        System.out.println("Enter a number1 : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter a number2 : ");
        int num2 = in.nextInt();
        System.out.println("Enter a base: ");
        int base = in.nextInt();
        int place = 1;
        int c = 0;
        while(num1 !=0 || num2 !=0){
            int d1 = num1%10;
            num1 = num1/10;
            int d2 = num2%10;
            num2 = num2/10;
            int mul = (d1*d2)+c;
            if(mul > base) {
                mul = mul % base;
            }
            c = mul/base;
            place = place*10;
            }

        }
    }
}
