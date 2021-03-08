package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//define if a brick will pass through a hole
public class Exercise10 {
    public static void main(String[] args) {
        Random random_a = new Random();
        Random random_b = new Random();
        int a = random_a.nextInt(20);
        int b = random_b.nextInt(20);
        int x = 0;
        int y = 0;
        int z = 0;
        System.out.println("Enter parameters of a brick:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Width: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("Length: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Height: ");
            z = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }

        if((x <= a && y <= b) || (y <= a && x <= b) ||
                (x <= a && z <= b) || (z <= a && x <= b) ||
                (z <= a && y <= b) || (y <= a && z <= b)) {
            System.out.println("A brick with such parameters will pass through a hole");
        } else {
            System.out.println("A brick won't pass through a hole");
        }
    }
}
