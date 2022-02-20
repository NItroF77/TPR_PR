import java.math.BigInteger;
import java.util.Scanner;
/**
 * <h1> BigNumber</h1>
 * @author Raihan
 * @version 1
 * @since 20-02-2022
 */
public class Soal6 {
    /**
     * The main method.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger num1 = input.nextBigInteger();
        BigInteger num2 = input.nextBigInteger();
        BigInteger sum_add = num1.add(num2);
        BigInteger sum_multiply = num1.multiply(num2);
        input.close();
        System.out.println(sum_add);
        System.out.println(sum_multiply);
    }
}
