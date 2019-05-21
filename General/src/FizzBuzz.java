/**
 * Problem statement: Write a short program that prints each number from 1 to 100 on a new line.
 * For each multiple of 3, print "Fizz" instead of the nummber.
 * For each multiple of 5, print "Buzz" instead of the number.
 * For numbers which are multiple of both 3 and 5, print "FizzBuzz" instead of the number
 *
 * Reference: statement taken from https://www.youtube.com/watch?v=h36mQC3JFMo  Java Brans - Java Interview Coding Challenge #1: FizzBuzz
 */
public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int STARING_NUMBER = 1;
    private static final int FINAL_NUMBER = 100;

    public static void main(String[] args) {

        for(int i = STARING_NUMBER; i <= FINAL_NUMBER; i++) {
            if (i%3 == 0 && i%5 == 0 ) {
                System.out.println(FIZZ.concat(BUZZ));
            } else if (i % 3 == 0) {
                System.out.println(FIZZ);
            } else if (i % 5 == 0) {
                System.out.println(BUZZ);
            } else {
                System.out.println(i);
            }
        }
    }

}
