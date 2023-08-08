import java.util.Scanner;
// Area of triangle
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = in.nextInt();
        System.out.println("Enter the height: ");
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area is "+ area );

    }
}
