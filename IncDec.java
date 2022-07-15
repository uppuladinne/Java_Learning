package incdec;

public class IncDec {

    public static void main(String[] args) {
        int x = 5, x1, y = 5, y1;
        
        x1 = x++;
        System.out.println(x + " " + x1);
        
        y1 = ++y;
        System.out.println(y + " " + y1);
    }
    
}
