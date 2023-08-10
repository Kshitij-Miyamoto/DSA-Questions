import java.util.Scanner;

public class Q26 {
    //LCM and GCD Problem
    public static void main(String[] args) {
        System.out.println("Enter First number: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = in.nextInt();
        int on1 = n1;
        int on2 = n2;

        while(n1%n2 != 0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        int GCD = n2;
        int LCM = (on1 * on2)/GCD;

        System.out.println("The GCD will be equal to " + GCD);
        System.out.println("The LCM will be equal to " + LCM);
    }
}
