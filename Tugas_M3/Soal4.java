import java.util.Scanner;
/**
 * <h1> Counting Salary an Agent</h1>
 * @author Raihan
 * @version 1
 * @since 20-02-2022
 */
public class Soal4 {
    /**
     * 
     * @param items_sold items sold by the agent.
     * @return
     */
    public static int CheckSalary(byte items_sold){
        final int BaseSalary = 500000;
        final int item_price = 50000;
        if(items_sold<15){
            return (int)(BaseSalary - (item_price*(15-items_sold)*0.15));
        }
        else if(items_sold<40){
            return (int) (BaseSalary + (item_price*(items_sold)*0.1));
        }
        else if(items_sold<80){
            return (int) (BaseSalary + (item_price*(items_sold)*0.25));
        }
        else{
            return (int) (BaseSalary + (item_price*(items_sold)*0.35));
        }
    }
    /**
     * The main method.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte items_sold = input.nextByte();
        input.close();
        System.out.println(CheckSalary(items_sold));
    }
}
