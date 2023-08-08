import java.util.Scanner;

public class Q2 {
    static double area(){
        System.out.print("Enter the radius: ");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        System.out.println("The radius is "+ radius);
        double ar = 3.14*radius*radius;
        return ar ;
    }
//Area of circle using a function area()
    public static void main(String[] args) {
        double ar = area();
        System.out.println("The area is " + ar);
    }
}
