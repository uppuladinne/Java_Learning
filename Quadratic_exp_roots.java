package quadratic_exp_roots;

import java.util.Scanner;

public class Quadratic_exp_roots {


    public static void main(String[] args) {
        int a, b, c; /* variable to hold coefficients of quadratic equation*/ 
        double discriminant, root1, root2;
        
        System.out.println ("Provide coefficients of quadratic equation");
        Scanner sc = new Scanner (System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        discriminant = Math.sqrt((b*b)-(4*a*c));
        root1 = ( -b + discriminant)/(2*a);
        root2 = (-b - discriminant)/(2*a);
        
        System.out.println ("Roots of quadratic equation: " + root1 +" and "+ root2);
    }
    
}
