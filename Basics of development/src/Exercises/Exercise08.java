package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Define value of max{min(a, b), min(c, d)}
public class Exercise08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int min1 = Math.min(a,b);
        int min2 = Math.min(c,d);
        int max = Math.max(min1,min2);
        System.out.println(max);
    }
}
