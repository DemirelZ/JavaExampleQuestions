import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PolindromWords {


    public static void main(String[] args) {

        System.out.println("reverseWord(\"zafer\") = " + reverseWord("zafer"));

        String [] liste={"ey",  "edip", "adanada", "pide", "ye"};

        removePolindrom(Arrays.asList(liste));

    }



    //    // interviev questions List<String>
    //    // List içerisindeki palindrom kelimeleri list içerinden silen metodu yazınız.
    //    //ey,  edip, adanada, pide, ye  ey,  edip,pide, ye



    public static String reverseWord(String str){

        String reverse="";

        for (int i = str.length()-1; 0 <= i; i--) {

            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static List<String> removePolindrom(List<String> list){


        for (int i = 0; i < list.size(); ) {

            if (list.get(i).equalsIgnoreCase(reverseWord(list.get(i)))){
                list.remove(list.get(i));
                continue;

            }
            i++;


        }

        return list;

    }

    public static List<String> removePalindromWithIterable(List<String> list){

        Iterator<String> iter=list.iterator();

        while (iter.hasNext()){

            String str= iter.next();
            if (str.equals(reverseWord(str))){
                iter.remove();

            }

        }

        return list;


    }





}
