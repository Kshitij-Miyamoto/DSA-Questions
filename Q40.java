import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        System.out.println("enter the first number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        int c = 0;
        int place = 1;
int d = 0;


        while(num2>0){
            int d1 = num1%10;
            num1 = num1/10;
            int d2 = num2%10;
            num2 = num2/10;


            d2 = d2 = d2;

            if(d2>=d1) {
                c = 0;
                d = d2 - d1;
            }else {
                c = -1;
                d = d2 + base - d1;
            }
            place = place *10;

            }
        System.out.println(d);

        }

    }

