import java.util.Scanner;

public class Soal5 {
    public static boolean Check_Total_Number(long sum){
        final int num_min = 999999;
        if((sum-num_min) % 5!=0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Lines = input.nextLine();
        String next[] = Lines.split(" ");
        long sum = Long.parseLong(next[0].concat(next[1]).concat(next[2]).concat(next[3]));
        input.close();
        if(Check_Total_Number(sum)){
            System.out.println("Jalan");
        }
        else{
            System.out.println("Berhenti");
        }
    }
}
