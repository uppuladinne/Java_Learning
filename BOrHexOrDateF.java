/*
 * Find if a number is Binary or not
 * Find if a number is Hexadecimal or not 
 * Find if the data in date format (dd/mm/yyyy) 
 */
package borhexordatef;

public class BOrHexOrDateF {

    public static void main(String[] args) {
        int b = 10101111; 
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        
        int h = 0xABC23EF; 
        String str1 = String.valueOf(h);
        System.out.println(str1.matches("[0-9A-F]*"));
        
        String date = "01/12/2022";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        
    }
    
}
