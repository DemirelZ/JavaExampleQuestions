import java.util.Scanner;

public class HackerRank_Question_11 {

    /*
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    Given a string A, print Yes if it is a palindrome, print No otherwise.

    Sample Input
    madam

    Sample Output
    yes
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        String depo = "";
        for (int i = A.length() - 1; 0 <= i; i--) {
            depo += A.charAt(i);
        }
        if (A.equals(depo)) {
            System.out.println("yes");
        } else System.out.println("no");


    }
}
