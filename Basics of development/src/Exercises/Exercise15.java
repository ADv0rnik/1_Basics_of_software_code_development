package Exercises;

import java.math.BigInteger;

//define product of the squares of the first two hundred numbers.
public class Exercise15 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}
