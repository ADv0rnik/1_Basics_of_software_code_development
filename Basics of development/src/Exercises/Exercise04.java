package Exercises;

//Swap the fractional and integer parts of a number and display the resulting value of the number
public class Exercise04 {
    public static void main(String[] args) {
        double x = 456.789;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
