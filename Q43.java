import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr;
        arr =  new int[n];
        for(int i = 1 ; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max =arr[0] ;
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println("Hence the span of the array is " + span);

    }
}
