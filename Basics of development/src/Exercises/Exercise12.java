package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//write a program which will summarize all the numbers up to the number entered by the user
public class Exercise12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i=1; i < x; i++){
            sum += i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println(sum);
    }
}