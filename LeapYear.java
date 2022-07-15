package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Provide year to check for leap year");
        int year = scan.nextInt();
        if (year%4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.print("Not a leap year");
                }
                
            } else {
                System.out.println("It is a leap year");
            }
            
        } else {
            System.out.print("Not a leap year");
        }
    }

}