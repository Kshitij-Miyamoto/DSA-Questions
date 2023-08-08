import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
       Scanner in  = new Scanner(System.in);
       int num = in.nextInt();
       int product = 1;
       int sum = 0;
  while(num != 0){
      int digit = num%10;
      product = product*digit;
      sum = sum + digit;
      num /= 10;

  }
        System.out.println("The product of the digit is " +product);
        System.out.println("The sum of the digit is " + sum);
        int diff = product - sum;
        System.out.println("Difference between the product and sum of digits : " + diff);
    }
}
