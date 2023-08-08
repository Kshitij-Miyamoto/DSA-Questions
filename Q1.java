import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Area of a circle
        System.out.println("Enter the radius of the circle: ");
        Scanner rad = new Scanner(System.in);
        int radius = rad.nextInt();
        double area =  (3.14*radius*radius);
        System.out.println("The Area is : "+ area);

    }
}
