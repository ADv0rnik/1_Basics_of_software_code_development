package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Find the sum of those members of the series which have modulus greater than or equal to a given e.
public class Exercise16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the e value:");
        double e = Double.parseDouble(reader.readLine());

        int n = 0;
        double a;
        double sum = 0;
        for(int i = 0; i < 10; i++){
            ++n;
            a = (1/Math.pow(2,n)) + (1/Math.pow(3, n));
            if (Math.abs(a)>e){
                sum = sum+a;
            }
        }
        System.out.printf("%.3f\n", sum);
    }
}