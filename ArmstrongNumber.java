package armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int n = scan.nextInt();
        int r, q;
        long armst = 0;
        q = n;
        
        while (q > 0) {
            r = q%10;
            armst = armst + (r*r*r);
            q = q/10;
        } 
        
        if (n == armst) {
            System.out.println("The number you entered is an Armstrong Number");
        } else {
            System.out.println("The number you entered is not an Armstrong Number");
        }
        
    }
}
