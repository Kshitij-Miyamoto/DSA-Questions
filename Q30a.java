import java.util.Scanner;
//occurences of a function, however this time with a function.
public class Q30a {
    static int occ(){
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter the number to be checked: ");
        int f = in.nextInt();
        int occ = 0;

        while(num != 0){
            int digit = num%10;
            num = num/10;
            if(digit == f){
                occ = occ+1;}
        }
        return occ;
    }

    public static void main(String[] args) {
       int z =  occ();
        System.out.println("The occurences are " +  z);
    }
}

