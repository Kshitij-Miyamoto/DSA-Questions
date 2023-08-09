import java.util.Scanner;

public class Q17 {
    public static int pro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter a number 2 : ");
        int num2 = in.nextInt();
        System.out.println("The product is : ");
        return num1*num2;
    }

    public static void main(String[] args) {
        int z = pro();
        System.out.println(z);

    }
}
