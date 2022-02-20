import java.util.Scanner;

/**
 * 
 */
public class Soal3 {
    /**
     * 
     * @param num1
     * @param num2
     * @param operation
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
     * 
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
