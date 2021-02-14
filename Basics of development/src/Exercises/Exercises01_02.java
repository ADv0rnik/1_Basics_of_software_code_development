package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Define function z = ((a-3)*b/2) + c
public class Exercises01_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double a = Double.parseDouble(reader.readLine());
        Double b = Double.parseDouble(reader.readLine());
        Double c = Double.parseDouble(reader.readLine());

        System.out.println(getFunction(a,b,c));


    }
    public static double getFunction (double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }

}
