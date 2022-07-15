package multiplication_table;

import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter number for multiplication table");
        
        int mul = scan.nextInt();
        
        for ( int i = 1; i <= 10; i++) {
            System.out.println(mul+"x"+i+" = "+(mul*i));
        }
        
    }
    
}
