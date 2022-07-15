package palindrome;

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a number check for palindrome");
        int n = scan.nextInt();
        int reverse = 0, r;
        int m = n;
        
        while (n > 0) {
            r = n%10;
            reverse = reverse*10+r;
            n=n/10;
        }
        
        if (reverse==m) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

    }
    
}
