import java.util.Scanner;
//To check the number of occurences of a digit in a number.
public class Q30 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter the number to be checked: ");
        int f = in.nextInt();
        int occ = 0;

        while(num != 0){
            int digit = num%10;
            num = num/10;
            if(digit == f){
                occ = occ+1;}
        }
        System.out.println("The number " + f + " has occured "+ occ + " times");
    }
}
