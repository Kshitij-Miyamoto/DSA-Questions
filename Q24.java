import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        //Inverse of a number problem really dope.
        System.out.println("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int op = 1;
        int inv  = 0;
        while(n != 0){
            int od = n%10;
            int id = op;   //Inverse digit = original place
            int ip = od;   //Inverse place = orginal digit
            inv = inv + id*(int)Math.pow(10,ip-1);//main logic of the problem

            n = n/10;//condition so that the number keeps on getting sliced.
            op++; //condition so that the loop keeps running.
        }
        System.out.println(inv);
    }
}
