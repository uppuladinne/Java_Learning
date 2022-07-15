package sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println(" Enter number to find sum of n numbers ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of "+n+" natural numbers is: " +  sum);
    }
    
}
