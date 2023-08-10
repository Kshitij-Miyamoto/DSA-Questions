import java.util.Scanner;

public class Q33 {
    //Decimal to Octal
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        int place = 1;
        int octal = 0;

        while(dec != 0){
            int oct = dec%8;
            dec = dec/8;
            octal = octal + oct*place;
            place = place * 10 ;
        }
        System.out.println("The decimal to Octal form will be " + octal);
    }
}
