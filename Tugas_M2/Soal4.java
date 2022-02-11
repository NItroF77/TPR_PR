package Tugas_M2;
/**
 * <h1>Operators</h1>
 * This Class is trying to explain how a operators work in java.
 * <b>modified by Raihan Fuad Syakir.
 * @author Dosen Pengampu
 * @version 1.0
 * @since 11-02-2022
 */
public class Soal4 {
    /**
     * This method is explaining how Math function work.
     * Math.round(number) has a data type of long so we need to
     * convert it to a data type that lighter depending on the number.
     * @param args
     */
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println("nx has value of "+nx);
    }
}
