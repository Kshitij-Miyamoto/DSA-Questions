import java.util.Scanner;

public class Q45 {
    //bar Chart Question
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr;
        arr = new int[n];
        //Taking custom input from the user into the array
        for(int i = 0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        int max = arr[0];
        //In the second block of code we specify that we are dealing with max()
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
            max = arr[i];
        }
        //In the 3rd block of code we put in conditions to make the building
        for(int floor = max ; floor >= 1 ; floor --){
            for(int i = 0 ; i < arr.length; i++)
            if(arr[i] >= floor){
                System.out.print("*\t");
            }else{
                System.out.print(" \t");
            }
            System.out.println();
        }


}
}
