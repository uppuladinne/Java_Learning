package switch_challenge;

import java.util.Scanner;

public class Switch_challenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Day based on number");
        int day = scan.nextInt();
        
        switch(day) {
            case 1:
                System.out.println ("Monday");
                break;
            case 2:
                System.out.println ("Tuesday");
                break;
            case 3:
                System.out.println ("Wednesday");
                break;
            case 4:
                System.out.println ("Thursday");
                break;
            case 5:
                System.out.println ("Friday");
                break;
            case 6:
                System.out.println ("Saturday");
                break;
            case 7:
                System.out.println ("Sunday");
                break;
            default:
                System.out.println ("Invalid Day number");
                break;   
        }
        System.out.println ("Month based on number");
        int month = scan.nextInt();
        
        switch(month) {
            case 1:
                System.out.println ("January");
                break;
            case 2:
                System.out.println ("February");
                break;
            case 3:
                System.out.println ("March");
                break;
            case 4:
                System.out.println ("April");
                break;
            case 5:
                System.out.println ("May");
                break;
            case 6:
                System.out.println ("June");
                break;
            case 7:
                System.out.println ("July");
                break;
            case 8:
                System.out.println ("August");
                break;
            case 9:
                System.out.println ("September");
                break;
            case 10:
                System.out.println ("October");
                break;
            case 11:
                System.out.println ("November");
                break;
            case 12:
                System.out.println ("December");
                break;
            default:
                System.out.println ("Invalid Month number");
                break;
        }
        
        String url = "http://www.google.com";
        
        String protocol = url.substring(0, url.indexOf(":"));
        String extension = url.substring(url.lastIndexOf(".")+1);
        
        switch (protocol) {
            case "http":
                System.out.println("Hypertext Transfer Protocol");
                break;
            case "ftp":
                System.out.println("File Transfer Protocol");
                break;
            default:
                System.out.println("Protocol is: " + protocol);
                break;
        }
        
        switch (extension) {
            case "com":
                System.out.println("Commerical Website");
                break;
            case "org":
                System.out.println("Organization Website");
                break;
            case "gov":
                System.out.println("Government Website");
                break;
            default:
                System.out.println("Website is: " + extension);
                break;
        }       
    }
    
}
