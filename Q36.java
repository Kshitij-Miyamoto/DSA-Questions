import java.util.Scanner;

public class Q36 {
    //Decimal to any base
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        int place = 1;
        int newvalue = 0;
        System.out.println("Enter the base: ");
        int base = in.nextInt();

        while (dec != 0) {
            int oct = dec % base;
            dec = dec / base;
            newvalue = newvalue + oct * place;
            place = place * 10;
        }
        System.out.println("The converted form will be " + newvalue);
    }
}
