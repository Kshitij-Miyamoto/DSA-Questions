import java.util.Scanner;

public class Q11 {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int largest = Integer.MIN_VALUE;
        while(true){
            int n = in.nextInt();
            if( n == 0){
            break;
        }
            if ( n > largest){
                largest = n;
            }
    }
        if( largest == Integer.MIN_VALUE){
            System.out.println("No numbers entered");
        } else{
            System.out.println("largest number entered = "+ largest);
        }
}
}
