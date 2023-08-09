import java.util.Scanner;

public class Q23 {
    //To print the reverse of a number
static void dig() {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = scn.nextInt();
    int rev = 0;
    while(num != 0){
        int digit = num%10;
        System.out.println(digit);
         num /= 10;
         rev  = rev*10 + digit;
        System.out.println("just to show how reverse logic works " + rev);
    }
    System.out.println("The final reverse of the number " +rev);
}

    public static void main(String[] args) {
        dig();
    }
}