import java.util.Scanner;
//This is prime facotrization problem with the help of nested loops
public class Q27 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int div = 2 ; div <= n ; div++){
            while(n % div == 0 ){
                System.out.println(div);
                n = n/div;
            }
        }
    }
}
