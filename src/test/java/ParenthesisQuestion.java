import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParenthesisQuestion {


    public static void main(String[] args) {

        String prntz = "()))((()";

        System.out.println(parentheses(prntz));


    }

    public static boolean parentheses(String str) {

        int count = 0;
        char[] charArr = str.toCharArray();

        for (char c : charArr) {

            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }

        }
        return count == 0;

    }





}
