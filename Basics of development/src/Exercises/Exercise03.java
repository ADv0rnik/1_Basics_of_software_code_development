package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

// Calculate value of the following equation : ((sin x + cos y)/(cos x - sin y)) * tg xy
public class Exercise03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = toRadians(Double.parseDouble(reader.readLine()));
        double y = toRadians(Double.parseDouble(reader.readLine()));
        double x_y = x * y;
        double result;

        double sin_x = sin(x);
        double cos_x = cos(x);
        double sin_y = sin(y);
        double cos_y = cos(y);
        double tg_xy = tan(x_y);

        result = ((sin_x + cos_y)/(cos_x - sin_y)) * tg_xy;
        System.out.printf("Result is: %.2f%n", result);
    }
}
