package Tugas_M2; //folder's name or library

import java.io.*;

/**
 * <h1>Soal 1</h1>
 * <b>Basic Calculator Two Numbers!</b>
 * The Basic_Calculator program implements an application that
 * simply adds or substract two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * <p>
 * <b> using references from Mr.Zulkifli </b>
 * 
 * @author Raihan
 * @version 1.0
 * @since 2022-02-09
 */
public class Soal1 { // namefile
    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     * 
     * @param numA This is the first paramter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return int This returns sum of numA and numB.
     */
    public int addNum(int numA, int numB) { // function in a class
        return numA + numB;
    }

    /**
     * This method is used to substract between two number.
     * This is just attemp trying to copy example to create a javadoc.
     * here's how it goes.
     * 
     * here's the explanation of each parameters.
     * 
     * @param num1 the number you want to substract.
     * @param num2 the number you use for substract.
     * @return this return the final number after being substracted.
     */
    public int Subsnum(int num1, int num2) { // function in a class
        return num1 - num2;
    }

    /**
     * This is the main method which makes use of Calculate method.
     * 
     * @param args Unused.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException {
        Soal1 obj = new Soal1();
        int subs = obj.Subsnum(300, 135);
        int sum = obj.addNum(10, 20);
        System.out.println("Sum of 10 and 20 is :" + sum);
        System.out.println("Substraction of 300 by 135 is :" + subs);
    }
}
