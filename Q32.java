import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        //Binary to decimal form
        System.out.println("Enter a binary number: ");
        Scanner in = new Scanner(System.in);
        int bin = in.nextInt();
        int place = 1;
        int decimal = 0;

        while(bin != 0){
            int dec = bin%10;
            bin = bin/10;
            decimal = decimal + dec*place;
            place = place*2;
        }
        System.out.println(decimal);
    }
}
