package area_triangle;

import java.util.Scanner;

public class Area_Triangle {

    public static void main(String[] args) {
        
         /* float base, height, area_of_triangle;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Provide base of the triangle");
        base = sc.nextFloat();
        System.out.println ("Provide height of the triangle");
        height = sc.nextFloat();
        
        area_of_triangle = (base * height)/2;
        
        
        System.out.println ("Area of triangle with base "+ base + " and height "
                + height + " is: " + area_of_triangle); */
         
        int a, b, c;
        float s;
        double area;
        
        System.out.println ("Provide sides of the triangle");
        Scanner sc = new Scanner (System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a + b + c)/2f;
        
        area = Math.sqrt((s*(s-a)*(s-b)*(s-c))); 
        
        System.out.println ("Area of the triangle: " + area);
        
        
        
    }
    
}
