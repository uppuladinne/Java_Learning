package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a number to find factorial value");
        
        int n = scan.nextInt();
        long factorial = 1; 
        
        if ( n == 0) {
            factorial = 1;
        } else {
            for ( int i=1; i <= n; i++ ) {
                factorial = factorial*i;
            }
        }

        System.out.println( n + "! is: " + factorial);
    }
    
}
