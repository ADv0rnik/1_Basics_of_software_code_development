package Exercises;

import java.io.IOException;

//Show on the screen symbol and corresponding numerical designation in the computer memory
public class Exercise17 {
    public static void main(String[] args) throws IOException {
        char a = (char)System.in.read();
        String bin = Integer.toBinaryString(a);
        System.out.println("The binary code: "+bin);
        System.out.println("Decimal: " + (int)a);
        System.out.printf("Unicode: %04X ", (int)a);
    }
}