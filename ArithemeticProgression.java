package arithemeticprogression;

import java.util.Scanner;

public class ArithemeticProgression {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter initial term in Arithmetic Progression");
        int a = scan.nextInt();
        System.out.println("Enter common diff in Arithmetic Progression");
        int d = scan.nextInt();
        System.out.println("Enter number of terms in Arithmetic Progression ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(a+",");
            a = a+d;            
        }
    }
    
}
