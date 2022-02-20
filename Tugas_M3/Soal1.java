import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * <h1>Split String using token</h1>
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+,
 * split the string into tokens. We define a token to be one or more
 * consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.
 * 
 * @author Raihan Fuad Syakir
 * @version 1
 * @since 17-02-2922
 */
public class Soal1 {
    /**
     * The main Method.
     * Using Scanner to receive input from user.
     * Using Tokenizer to split the string.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sentences = input.nextLine();
        input.close();
        StringTokenizer T_Sentences = new StringTokenizer(Sentences, "[@&.?$+-]+'_;:{}^!@#$%^&*() ");
        while (T_Sentences.hasMoreTokens()) {
            System.out.println(T_Sentences.nextToken());
        }
    }
}
