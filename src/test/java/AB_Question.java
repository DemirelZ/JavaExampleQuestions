public class AB_Question {




    /*
    Given a string str which only consist of characters 'A' and 'B', find the absolute difference between their
    number of occurrences.

    Ex.:
    Input: "AAABAB"
    Output: 2

    Input: "AAAAAAAAB"
    Output: 7

    Input: "BB"
    Output: 2

    Constrains:
    All characters in 'str' are either 'A' or 'B'
     */

    public static void main(String[] args) {

        System.out.println(subtractionOfLetterAB("BBBBBBBBBBBA"));

    }

    public static int subtractionOfLetterAB(String str) {

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'A') {
                countA++;
            } else if (str.charAt(i) == 'B') {
                countB++;
            }
        }
        return Math.abs(countA - countB);
    }

}
