import java.util.Scanner;

public class Q20 {
    public static void pal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int reverse = 0;
        int originalnum = num ; //for comparision purposes
        while(num != 0) {
            int digit = num % 10;
            num /= 10;
            reverse = reverse * 10 + digit;
        }
            if(reverse == originalnum){
                System.out.println("The number is palindrome");
            }else{
                System.out.println("The number is no palindrome");
            }
        }

    public static void main(String[] args) {
        pal();
    }
}
