package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Define values by following equation ((b + sqrt(b^2 + 4* a * c))/(2 * a)) - a^3 * c + (1/b^2)
public class Exercise02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

        double b2 = Math.pow(b,2);
        double b_2 = Math.pow(b, -2);
        double a3 = Math.pow(a, 3);
        double z = b2 - 4*a*c;
        if(z < 0) {
            System.out.println("The radical expression is less than 0");
        } else {
            double y = Math.sqrt((z));
            double f = ((b + y)/(2 * a)) - a3 * c + b_2;
            System.out.printf("%.2f", f);
        }
    }

}