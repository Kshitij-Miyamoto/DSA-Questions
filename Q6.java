import java.util.Scanner;
//Print any number of terms of a fibonacci series
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = in.nextInt();
        System.out.println("Enter the first number of the series");
        int n1 = in.nextInt();
        System.out.println("Enter the second number of the series");
        int n2 = in.nextInt();

        for(int i = 0 ; i<n ; i++){
            int next = n1 + n2 ;
            System.out.println(next);
            n1 = n2;
            n2 = next;
        }
    }
}
