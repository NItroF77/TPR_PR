import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
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
