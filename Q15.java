import java.util.Scanner;

public class Q15 {
   // Define a program to find out whether a given number is even or odd.
  static void OddEven(){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number : ");
      int num = in.nextInt();
      if(num %2 == 0){
          System.out.println("The number is even");
      }else{
          System.out.println("The number is odd");
      }

  }

    public static void main(String[] args) {
        OddEven();
    }
}
