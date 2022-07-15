package displaydigits;

import java.util.Scanner;

public class DisplayDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int n = scan.nextInt();
        int count = 0;
        
        while (n > 0) {
            System.out.println(n%10);
            n = n/10;
            count++;
        } 
        System.out.println("number of digits in number: " + count);
    }
    
}
