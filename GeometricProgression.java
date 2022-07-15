package geometricprogression;

import java.util.Scanner;

public class GeometricProgression {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter initial term in Geometric Progression");
        int a = scan.nextInt();
        System.out.println("Enter common ratio in Geometric Progression");
        int r = scan.nextInt();
        System.out.println("Enter number of terms in Geometric Progression ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a+",");
            a = a*r;            
        }
    } 
}
