import java.util.Scanner;

public class Q21 {
    //Write a function that returns the sum of first n natural numbers.
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
     for(int i = 1 ; i <= n ; i++){
         System.out.println(i);
         sum = sum + i;
        }
     return sum;
    }

    public static void main(String[] args) {
        int z = sum();
        System.out.println("The sum of the natural numbers is :" + z);
    }
}
