package bitwise_operation;

public class Bitwise_Operation {

    public static void main(String[] args) {
        byte x = 8, y = 12;
        byte z;
        
        z = (byte)((y<<4)|x);
        System.out.println("y is " +((z&0b11110000)>>4));
        System.out.println("x is " + (z&0b00001111));

    }
    
}
