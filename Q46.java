import java.util.Scanner;
//Sum of an Array
public class Q46 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr;
        arr= new int[n];
        System.out.println("Enter the length of the array: ");
        int n1 = in.nextInt();
        int [] arr1;
        arr1= new int[n1];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        for(int x = 0 ; x < arr1.length; x++){
            arr1[x] = in.nextInt();
            System.out.println(arr[x]);
        }
        int sum = arr[0] + arr1[0];

    }
}
}
