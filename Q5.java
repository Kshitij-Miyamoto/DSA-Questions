public class Q5 {
    //fibonacci series in java
    public static void main(String[] args) {
        int n = 10;
        int n1 = 1;
        int n2 = 2;
        for( int i = 0 ; i < n ; i++){
            int next = n1 + n2;
            System.out.println(next);
            //condition
            n1 = n2 ;  //this is the main concept of the problem
            n2 = next;
        }

        }

    }

