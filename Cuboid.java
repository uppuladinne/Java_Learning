package cuboid;

import java.util.Scanner;

public class Cuboid {

       public static void main(String[] args) {
        int l, b, h; /* variable to hold length breadth and height of a cuboid*/ 
        int area, volume;
        
        System.out.println ("Provide length breadth and height of a cuboid");
        Scanner sc = new Scanner (System.in);
        
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        
        area = 2*(l*b + b*h + l*h) ;
        volume = l*b*h;

        
        System.out.println ("Area and volume of a cubiod : " + area +"  "+ volume);
    }
    
}
