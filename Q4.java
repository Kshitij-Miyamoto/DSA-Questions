import java.util.Scanner;
// Here I solved area of a triangle using Function
public class Q4 {
    static double area(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = in.nextDouble();
        System.out.println("Enter the height: ");
        double height = in.nextDouble();
        double ar = 0.5*base*height;
        System.out.print("The area is : ");
        return ar ;
    }

    public static void main(String[] args) {
       double z =  area();
        System.out.println(z);
    }
}
