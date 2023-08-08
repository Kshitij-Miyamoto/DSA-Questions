import java.util.Scanner;

public class Q8 {
    //Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("The number of factors");
        int f = in.nextInt();
        for(int i = 0 ; i < f ; i++ ){
            int factor = n*i ;
            System.out.println(factor);
        }
    }
}
