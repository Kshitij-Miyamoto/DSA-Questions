import java.util.Scanner;

public class Q41 {
    //Any base multiplication
    /*public static void main(String[] args) {
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

     */
    public static void main(String[] args) {
        System.out.println("Enter a number1: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = in.nextInt();
        System.out.println("Enter a base: ");
        int base = in.nextInt();
        int result = 0;
        int place = 1;

        while (num2 != 0) {
            int d2 = num2 % 10;
            num2 = num2 / 10;
            int carry = 0;
            int tempNum1 = num1; //This is the main cavate of this question.//
            int tempPlace = place;//Intializing temPlace and Tempname variable to get going//

            while (tempNum1 != 0 || carry != 0) {
                int d1 = tempNum1 % 10;//here we use a new variable as the value of num1 is changing.
                tempNum1 = tempNum1 / 10;

                int product = (d1 * d2) + carry;
                carry = product / base;//condition for carry value
                product %= base;//condition for product will give us the remainder of the product.

                result += product * tempPlace;
                tempPlace *= 10; //Condition for the temPlace variable.
            }

            place *= 10;//condition for the place variable
        }

        System.out.println("Result: " + result);
    }
}
