package menudrivenprogram;

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter 2 number to perform selected math operation");
        
        int a = scan.nextInt();
        int b = scan.nextInt(); 
        scan.nextLine();
        
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        System.out.println("Select an option from menu");
        String option = scan.nextLine();
        
        switch (option.toUpperCase()) {
            case "ADD":
                System.out.println("Sum of the number entered: " + (a+b));
                break;
            case "SUB":
                System.out.println("Diff of the number entered: " + (a-b));
                break;           
            case "MUL":
                System.out.println("Product of the number entered: " + (a*b));
                break;
            case "DIV":
                System.out.println("Quotient of the number entered: " + (a/b));
                break;  
            default:
                System.out.println("Invalid option is selected");
                break;
        }
    }
    
}
