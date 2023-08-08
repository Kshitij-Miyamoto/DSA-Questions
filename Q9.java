import java.util.Scanner;

public class Q9 {
    static void fact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println(" Enter the number of factors you want");
        int f = in.nextInt();
        for (int i = 0; i < f; i++) {
            int factor = n * i;
            System.out.println(factor);
        }
    }

    public static void main(String[] args) {
        fact();
    }
}

