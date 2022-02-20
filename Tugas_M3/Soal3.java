import java.util.Scanner;

/**
 * <h1> Basic Math Operation With 2 Numbers</h1>
 * @author Raihan
 * @version 1
 * @since 20-02-2022
 */
public class Soal3 {
    /**
     * 
     * @param num1 first number that user input.
     * @param num2 second number that user input.
     * @param operation the operation user input.
     * @return
     */
    public static int CheckOperation(int num1, int num2, char operation){
        if(operation=='+'){
            return num1+num2;
        }
        else if(operation=='-'){
            return num1-num2;
        }
        else if(operation=='*'){
            return (num1*num2);
        }
        else if(operation=='/'){
            return (num1/num2);
        }
        else if(operation=='%'){
            return (num1%num2);
        }
        else{
            return 0;
        }
    }
    /**
     * The main method.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        char operation;
        num1 = input.nextInt();
        operation = input.next().charAt(0);
        num2 = input.nextInt();
        input.close();
        System.out.println(CheckOperation(num1, num2, operation));
    }
}
