import java.util.Scanner;

public class Q38 {
        public static void main(String[] args) {
            //any base to decimal form
            System.out.println("Enter a  number: ");
            Scanner in = new Scanner(System.in);
            int bin = in.nextInt();
            System.out.println("Enter the base1: ");
            int base1 = in.nextInt();
            int place = 1;
            int newvalue = 0;
            System.out.println("Enter the base2: ");
            int base = in.nextInt();

            while(bin != 0){
                int dec = bin%base1;
                bin = bin/base1;
                newvalue = newvalue + dec*place;
                place = place*base;
            }
            System.out.println(newvalue);
        }
}
