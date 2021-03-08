package Exercises;

import java.util.Random;

//Define if three points belong to one line
public class Exercise09 {
    public static void main(String[] args) {
        Random random_x1 = new Random();
        Random random_y1 = new Random();
        Random random_x2 = new Random();
        Random random_y2 = new Random();
        Random random_x3 = new Random();
        Random random_y3 = new Random();
        int x1 = random_x1.nextInt(10);
        int y1 = random_y1.nextInt(10);
        int x2 = random_x2.nextInt(10);
        int y2 = random_y2.nextInt(10);
        int x3 = random_x3.nextInt(10);
        int y3 = random_y3.nextInt(10);
        System.out.print("Point A: ("+String.valueOf(x1)+","+String.valueOf(y1)+") ");
        System.out.print("Point B: ("+String.valueOf(x2)+","+String.valueOf(y2)+") ");
        System.out.println("Point C: ("+String.valueOf(x3)+","+String.valueOf(y3)+") ");
        if ((y2-y1) == 0 || (x2-x1) == 0){
            System.out.println("Error: division by zero");
        } else if (((y3 - y1)/(y2 - y1))==((x3 - x1)/(x2 - x1))){
            System.out.println("Points belong to a line");
        } else {
            System.out.println("Points doesn't belong to a line");
        }
    }
}