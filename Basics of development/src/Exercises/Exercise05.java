package Exercises;

//Convert T value presented in seconds to hours, minutes and seconds presented in the following format: HH h MM min SS sec
public class Exercise05 {
    public static void main(String[] args) {
        int seconds = 10000;
        System.out.println(getTime(seconds));
    }

    public static String getTime(int value){
        long hh = value/3600;
        long mm = value/60 % 60;
        long ss = value % 60;
        return String.format("%s ч %s мин %s сек", hh, mm, ss);
    }
}