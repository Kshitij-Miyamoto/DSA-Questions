import java.util.Scanner;

public class Q35 {
    //Octal to decimal
    public static void main(String[] args) {
        System.out.println("enter an octal number: ");
        Scanner in = new Scanner(System.in);
        int oct = in.nextInt();
        int place = 1;
        int decimal = 0;


        while(oct != 0){
            int dec = oct%10;
            oct = oct/10;
            decimal = decimal + dec*place;
            place = place*8;

        }
        System.out.println(decimal);

    }
}
