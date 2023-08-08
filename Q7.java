import java.util.Scanner;

public class Q7 {
   static void fibo(){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of terms: ");
      int n = in.nextInt();
      System.out.println("Enter the first number of the series");
      int n1 = in.nextInt();
      System.out.println("Enter the second number of the series");
      int n2 = in.nextInt();

       System.out.println(n1);
       System.out.println(n2);

      for(int i = 2 ; i<n ; i++){//Basically we are running this loop in order to get the number of terms in the
                                    //fibonacci numbers.
          int next = n1 + n2 ;
          System.out.println(next);
          n1 = n2;
          n2 = next;
       }

   }

    public static void main(String[] args) {
    fibo();
    }
}
