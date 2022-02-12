package Tugas_M2;

import java.util.Scanner; //to use input
import java.lang.Math; //to use power function.

/**
 * <h1>Soal 2</h1>
 * in here we can determine which number the limit
 * of variety numerik data type.
 * 
 * @author Raihan
 * @version 1.0
 * @since 11-02-2022
 */
public class Soal2 {
    /**
     * This method is used to determine if a number
     * can be assign to anywhere.
     * 
     * @param number the number you want to check whichever data type can hold it.
     * 
     */
    public void CheckDataType(long number) {
        System.out.printf("%d can be fitted in: \n", number);
        if (number >= -(Math.pow(2, 7)) && number <= (Math.pow(2, 7)) - 1) {
            System.out.println("*byte");
        }
        if (number >= -(Math.pow(2, 15)) && number <= (Math.pow(2, 15)) - 1) {
            System.out.println("*short");
        }
        if (number >= -(Math.pow(2, 31)) && number <= (Math.pow(2, 31)) - 1) {
            System.out.println("*integer");
        }
        System.out.println("*long");
    }

    /**
     * This is the main method.
     * Here's where the input function located.
     * 
     * @param args
     */
    public static void main(String args[]) {
        Soal2 obj = new Soal2();
        long number;
        // create an object of Scanner
        try (Scanner input = new Scanner(System.in)){
            for (byte i = 0; i <= 5; i++) {
                try {
                    // take input from the user
                    number = input.nextLong();
                    obj.CheckDataType(number);
                } catch (Exception e) {
                    System.out.println("can't be fitted anywhere.");
                    input.nextLine();
                }
            }
        }
    }
}