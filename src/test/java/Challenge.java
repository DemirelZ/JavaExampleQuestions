import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Challenge {



    /*

    In this challenge, we want to iterate through on the characters of the input string and check whether the number of the occurrences for each characters are equal. For example, "abcde" is a valid string, on the other hand, "abcdeee" is not because count of 'e' is 3, not 1 as the others.
Moreover, we have chance to remove only one character from the string in order to make it valid. Think of a scenario: "xyzz" is given to us and we should remove one of these 'z' characters. In this case, we can assume that the string is valid since each existing characters exist only single time after the removal operation.
Specification

Challenge.isValid(str)
Decide the given string is valid in terms of character counts including possibility of one character removal
Parameters
str: String - input to be searched
Return Value
boolean - final decision about that string, true or false
Constraints
•    Input string consists of English alphabet characters
•    All of the characters are lowercase
Examples
"cac" => true - we can get rid of one these 'c' chars
"aabcc" => true - if we remove 'b', then it is ok
"efgh" => true - we even don't need to use remove operation
"mumukkpp" => true - all of them occurred twice
"pppenm" => false - even tough we delete one 'p', thats not enough, still one more 'p' exists
"ekekua" => false - we can either remove 'u' or 'a', but in any case, the remaining one breaks the rule
     */



//    public static boolean isValid2(String str) {
//        String str1 = str.toLowerCase();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < str1.length(); ) {
//            int count = 0;
//            String control = str1.substring(0, 1);
//            count = str1.length() - str1.replace(control, "").length();
//            list.add(count);
//            str1 = str1.replace(control, "");
//        }
//
////        List<Integer> list1 = list.stream().distinct().toList();
////        if (list1.size() > 2) {
////            return false;
////        } else if (list1.size() == 1) {
////            return true;
////        } else if ((list1.size() == 2) && ((list1.get(0) == 1) || list1.get(1) == 1)) {
////            return true;
////        }
//
//        Collections.sort(list);
//
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < list.size(); ) {
//            int count = 1;
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) == list.get(j)) {
//                    count++;
//                }
//            }
//            list2.add(count);
//            int n = list.get(0);
//            list.removeIf(e -> e == n);
//        }
//        Collections.sort(list2);
//
//      //  return (list2.get(0) == 1) && (list1.get(1) - 1 == list1.get(0));
//
//    }



}
