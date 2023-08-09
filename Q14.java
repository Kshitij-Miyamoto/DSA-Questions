import java.util.Scanner;

public class Q14 {
    //Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by the user.

    static void max(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = in.nextInt();
        System.out.println("Enter the second number ");
        int b = in.nextInt();
        System.out.println("Enter the third number ");
        int c = in.nextInt();
        if((a > b)&&(a > c)) {
            System.out.println("a is the greatest " + a);
        }
            if((b > a)&&(b > c)){
                System.out.println("a is the greatest " + b);
        }else{
                System.out.println("c is the greatest " + c);
            }
    }

    static void min(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = in.nextInt();
        System.out.println("Enter the second number ");
        int b = in.nextInt();
        System.out.println("Enter the third number ");
        int c = in.nextInt();
        if((a < b)&&(a < c)) {
            System.out.println("a is the Smallest " + a);
        }
        if((b < a)&&(b < c)){
            System.out.println("b is the Smallest " + b);
        }if((c < a)&&(c < a)){
            System.out.println("c is the Smallest " + c);
        }
    }

    public static void main(String[] args) {
     max();
     min();
    }
}


