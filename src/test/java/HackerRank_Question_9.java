import java.util.Scanner;

public class HackerRank_Question_9 {

    public static void main(String[] args) {

        /*
        Sample input
        Helloword
        3 7

        Sample output
        lowo
         */

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));


    }




}
