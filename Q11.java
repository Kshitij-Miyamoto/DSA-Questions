import java.util.Scanner;

public class Q11 {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int largest = Integer.MIN_VALUE;
        /*Integer.MIN_VALUE is often used as an initial value when you want
         to find the maximum or minimum value among a set of numbers. For example,
         if you are searching for the largest number in a list, you can initialize a
         variable with Integer.MIN_VALUE before iterating through the list.
         This ensures that any value you compare against it will be considered larger,
         regardless of the actual values in the list.
         */
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
