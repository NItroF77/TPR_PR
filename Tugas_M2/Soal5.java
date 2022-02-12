package Tugas_M2;

/**
 * <h1>Operators 2</h1>
 * This Class is used to analyze how a function with a certain data type work.
 * <b>modified by Raihan Fuad Syakir</b>
 * 
 * @author Dosen pengampu
 * @version 1
 * @since 11-02-2022
 */
public class Soal5 {
    /**
     * This method is declared as short
     * so when this function called it will return a value with data type short.
     * 
     * @param l
     * @return short i.
     */
    static short methodOne(long l) {
        int i = (int) l; // will not change the value for -128<= l <=127.
        return (short) i; // will return it after change the data type to short as short as the function
                          // stated.
    }

    /**
     * The main method of class
     * here try an example of a data type converted into other.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        double d = 126.5;
        float f = (float) d; // from a double to float will not change the value becase both a decimal data
                             // type.
        byte b = (byte) methodOne((long) f); // convert from float to a long and remove the decimal without rounding.
        System.out.println(b);
    }
}
