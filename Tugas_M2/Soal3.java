package Tugas_M2;

/**
 * <h1>Soal 3</h1>
 * <b> comparing what's the different declaring a constant
 * in a method or as a method.
 * <b>modified by Raihan Fuad Syakir</b>
 * @author Dosen Pengampu
 * @version 1.0
 * @since 11-02-2022
 */
public class Soal3 {
    /**
     * This Constant can be called in any method.
     * 
     */
    public static final double CM_PER_INCH2 = 2.54;

    /**
     * This method is to proofing that depending on where declare a constant or a
     * variable
     * in a method can be called by any other method.
     * Any if the variable declared in a method it will just be a local variale.
     */
    public void CallConstant(double paperWidth, double paperHeight) {
        
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH2 + " by " + paperHeight * CM_PER_INCH2); // can be seen the CM_PER_INCH2 can be called
                                                                    // by any method.
        /*
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);// while inside main cant because its local variable.
        */
        }

    /**
     * This is the main method of the program.
     * Here declare a Constant called CM_PER_INCH as local
     * so when move to any other method that variabel cannot be called.
     * 
     * @param args
     */
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        Soal3 obj = new Soal3();
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        obj.CallConstant(paperWidth, paperHeight);
    }
}