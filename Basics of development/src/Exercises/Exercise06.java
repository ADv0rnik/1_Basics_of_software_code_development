package Exercises;
import java.lang.Math;

//find out if the given point (x,y) belongs to a polygon
public class Exercise06 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 5);
        System.out.println(x);
        System.out.println(y);
        if(x >= -4 && x <= 4 && y >= -3 && y <= 0){
            System.out.println("the point belongs to a polygon");
        }
        else if(x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            System.out.println("the point belongs to a polygon");
        }
        else System.out.println("the point does not belongs to a polygon");
    }
}
