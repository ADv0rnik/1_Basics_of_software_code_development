package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//define the value of the function
public class Exercise13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for point A: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter a value for point B: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Define step: ");
        int h = Integer.parseInt(reader.readLine());
        System.out.println("Enter a value for X: ");
        int x = Integer.parseInt(reader.readLine());
        int y;

        for(int i = a; i <= b; i = i + h){
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x= "+x+"\n"+"y= "+ y);
        }
    }
}