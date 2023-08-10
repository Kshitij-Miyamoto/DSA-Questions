import java.util.Scanner;
// program for factorial of a number
public class Q29 {
    static void fac(){
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        fac();
    }
}
