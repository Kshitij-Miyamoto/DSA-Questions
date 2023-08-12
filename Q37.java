import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        //any base to decimal form
        System.out.println("Enter a  number: ");
        Scanner in = new Scanner(System.in);
        int bin = in.nextInt();
        int place = 1;
        int newvalue = 0;
        System.out.println("Enter the base: ");
        int base = in.nextInt();

        while(bin != 0){
            int dec = bin%10;
            bin = bin/10;
            newvalue = newvalue + dec*place;
            place = place*base;
        }
        System.out.println(newvalue);
    }
}

