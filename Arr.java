public class Arr {
    public static void main(String[] args) {
        System.out.println("Now I become engineer, I become array : ");
        int[] arr;
        arr = new int [5];
        arr[0]=99;
        arr[1]=96;
        arr[2]=99;
        arr[3]=97;
        arr[4]=98;
        System.out.println(arr[0]);//here we are trying to access the array elements.
        for(int i = 0; i <arr.length ; i++){
            System.out.println(arr[i]);//moving through an array.
        }
        System.out.println("The length of the array is: ");
        System.out.println(arr.length);
    }
}
