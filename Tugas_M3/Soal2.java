import java.util.Scanner;

public class Soal2 {
    /**
     * This is method to printing out a splitted string by space
     * depending on the number will change the zero digit at the front number.
     * 
     * @param word    String that will be printed.
     * @param numbers numbers that will be printed.
     */
    public static void PrintOut(String word[], short numbers[]) {
        System.out.println("================================");
        for (int iterative = 0; iterative < 3; iterative++) {
            if (numbers[iterative] < 10) {
                System.out.printf("%-15s00%d%n",word[iterative],numbers[iterative]);
            } else if (numbers[iterative] < 100) {
                System.out.printf("%-15s0%d%n",word[iterative],numbers[iterative]);
            } else {
                System.out.printf("%-15s%d%n",word[iterative],numbers[iterative]);
            }
        }
        System.out.println("================================");
    }

    /**
     * The main method where's user input.
     * @param args
     */
    public static void main(String[] args) {
        short numbers[] = new short[3];
        String word[] = new String[3];
        Scanner input = new Scanner(System.in);
        for (int iterative = 0; iterative < 3; iterative++) {
            word[iterative] = input.next();
            numbers[iterative] = input.nextShort();
        }
        input.close();
        PrintOut(word, numbers);
    }
}
