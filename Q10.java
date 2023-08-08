import java.util.Scanner;

public class Q10 {
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public static void main(String[] args) {
    System.out.println("enter a number : ");
    Scanner in = new Scanner(System.in);
   int input;
   int sum = 0;
           while(true){
               input = in.nextInt();
               if(input == 0){
                   break;
               }
               sum = sum + input;
           }
    System.out.println("Sum of the entered number is : "+ sum);
        }

    }

