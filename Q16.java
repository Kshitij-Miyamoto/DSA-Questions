import java.util.Scanner;

public class Q16 {
    static void elig(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = in.nextInt();
        if( age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You aren't eligible to vote");
    }
}

    public static void main(String[] args) {
    elig();
    }
}
