import java.util.Scanner;
//Element of the array :
public class Q44 {
    public static void main(String[] args) {

        //Element of an array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total elements of an array: ");
        int n = in.nextInt();
        int arr[];
        arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the element of the array to get printed");
        int x = in.nextInt();
        int idx = -1;
        for( int i = 0; i<arr.length;i++){
        if(arr[i] == x) {
            idx = i;
            System.out.println("The index of the element is " + arr[i]);

        }
    }
}}
