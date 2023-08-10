import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        System.out.println("Enter the sides: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a > b && a > c){
            System.out.println(a + " Is the hypotenuse");
            if( a*a >= (b*b+c*c)){
                System.out.println("Triplet possible");
            }else{
                System.out.println("Triplet not possible");
            }
        }
        if(b > a && b > c){
            System.out.println(b + " Is the hypotenuse");
            if( b*b >= (a*a + c*c)){
                System.out.println("Triplet possible");
            }else{
                System.out.println("Triplet not possible");
            }
        }
        if(c > b && c > a){
            System.out.println(c + " Is the hypotenuse");
            if( c*c >= (b*b + a*a)){
                System.out.println("Triplet possible");
            }else{
                System.out.println("Triplet not possible");
            }
        }

    }
}
