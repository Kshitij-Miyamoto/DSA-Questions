import java.util.Scanner;

public class Q42 {//this is an array which can take inputs from the user and hence move without any hassles
    public static void main(String[] args) {
        System.out.println("Enter a number for the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr;
        arr = new int[n];
       for(int i=0; i < arr.length ; i++){
           arr[i] = in.nextInt();
           System.out.println(arr[i]);
        }
    }
}
