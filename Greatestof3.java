package greatestof3;

public class Greatestof3 {

    public static void main(String[] args) {
        int a = 5, b = 16, c =10;
        
        if (a>b && a>c) {
            System.out.println("a is greater than b and c");
        } 
        else if (b>c) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than a and b");
        }
    }
    
}
