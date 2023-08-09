import java.util.Scanner;

public class fibo {
    static void fib(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first term: ");
        int firstterm = scn.nextInt();
        System.out.println("Enter the second term: ");
        int secondterm = scn.nextInt();
        System.out.println("Enter the number of terms:");
        int num = scn.nextInt();
        int sum = 0;
            for(int i = 0 ; i < num ; i++){
                int next = firstterm + secondterm;
                System.out.println(next);
                firstterm= secondterm; //this is the main logic while printing a fibonci series.
                secondterm = next;
                sum = sum + next;// Ww wrote this logic in order to get the sum of the fibonacci series.
        }
        System.out.println("The sum of the series is " + sum);
    }

    public static void main(String[] args) {
        fib();
    }
}
