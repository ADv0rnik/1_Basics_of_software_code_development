package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//define the value of the function
public class Exercise11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        double result;

        if(x <= 3) {
            result = Math.pow(x,2) - (3 * x) +9;
            System.out.println(result);
        } else {
            result = (1 / (Math.pow(x,3)+6));
            System.out.printf("%.3f", result);
        }
    }
}
