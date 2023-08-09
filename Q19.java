import java.util.Scanner;

public class Q19 {
    /*Write a program that will ask the user to enter his/her marks (out of 100).
     Define a method that will display grades according to the marks entered as below: 
     */
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }

        System.out.println("Total Marks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
        System.out.println("The percentage is : " +percentage);

        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;

    }
}
}
