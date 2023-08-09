import java.util.Scanner;

public class Q18 {
    static void circ(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = in.nextInt();
        double area = 3.14*r*r;
        System.out.println("The area is : "+ area);
        double perimeter = 2 * 3.14 * r;
        System.out.println("The perimter is "+ perimeter);
    }

    public static void main(String[] args) {
        circ();
    }
}
