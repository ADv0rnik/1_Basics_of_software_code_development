package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Define if a triangle exists
public class Exercise07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        final int SUM_OF_ANGLES = 180;

        int c = SUM_OF_ANGLES - (a + b);
        if(a >= SUM_OF_ANGLES || b >= SUM_OF_ANGLES){
            System.out.println("The triangle doesn't exist");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("The triangle exists. Right triangle");
        } else {
            System.out.println("The triangle exists");
        }
    }
}