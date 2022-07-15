package reversenumber;

import java.util.*;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a number");
        int n = scan.nextInt();
        
        int reverse = 0, r;
        
        while (n>0) {
            r=n%10;
            reverse = reverse*10+r;
            n = n/10;
        }
        
        System.out.println(reverse);
    }
    
}
