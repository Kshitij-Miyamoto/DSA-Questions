import java.util.Scanner;

public class Q32a {
    //Binary to Decimal form
    public static void main(String[] args) {
        System.out.println("enter a binary number: ");
        Scanner in = new Scanner(System.in);
        int bin = in.nextInt();
        int dec = 0;
        int place = 1;

        while(bin != 0){
            int dig = bin%10;
            bin = bin/10;
            place = place * 2;
            dec = dec + bin*place;

        }
        System.out.println(dec);
    }
}
