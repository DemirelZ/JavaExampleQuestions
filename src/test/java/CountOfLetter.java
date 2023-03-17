import java.util.ArrayList;
import java.util.List;

public class CountOfLetter {
    public static void main(String[] args) {


//        System.out.println(countLetter("karaaarrryyyabacak"));
//        System.out.println("countOfLetter(\"karabacak\") = " + countOfLetter("karabacak"));

//        int[] xarr = {10, 20, 30, 60, 50, 5};
//        System.out.println("bigOne(xarr) = " + maxOne(xarr));
//        System.out.println("minOne(xarr) = " + minOne(xarr));

        System.out.println(yeniKelimeUret("ün görmüştü"));


    }

    //karabacak --> 2k, 4a, 1r, 1b, 1c

    public static List<String> countLetter(String str) {

        List<String> list = new ArrayList<>();
        String letter = "";
        int count = 0;

        while (!str.isEmpty()) {

            String substring = str.substring(0, 1);
            letter = substring;
            int i = (str.length()) - (str.replaceAll(substring, "")).length();
            count = i;

            list.add(count + "" + letter);
            //count = 0;
            str = str.replaceAll(str.substring(0, 1), "");


        }
        return list;
    }

    public static List<String> countOfLetter(String str) {

        List<String> newList = new ArrayList<>();

        while (!str.isEmpty()) {

            String firstLetter = str.substring(0, 1);
            int countLetter = str.length() - (str.replaceAll(firstLetter, "").length());

            newList.add(countLetter + "" + firstLetter);

            str = str.replaceAll(firstLetter, "");
        }
        return newList;

    }

    //    İnt arry in en büyük elemanının döndüren bir method yazın


    public static int maxOne(int[] arr) {

        int max = arr[0];

        for (Integer box : arr) {
            if (box > max) {
                max = box;
            }
        }

        return max;
    }

    public static int minOne(int[] arr) {

        int min = arr[0];

        for (Integer box : arr) {
            if (box < min) {
                min = box;
            }
        }
        return min;

    }


    /*
    //Dün akşam eve giderken onları görmüştüm.
// Cümlesindeki ü harfinin önünde
// ve arkasında olan harflerden bir string üreten bir method yazın.
     */

    public static String yeniKelimeUret(String str) {

        String result="";
        //String str="ünlü akşam eve giderken onları görmüştü";
        if(str.substring(0,1).equals("ü")) result+=str.substring(1,2);


        for(int i=1; i<str.length()-1; i++){

            if(str.substring(i,i+1).equals("ü")){
                result+=str.substring(i-1,i);
                result+=str.substring(i+1,i+2);
            }
        }


        if(str.substring(str.length()-1).equals("ü")) result+=str.substring(str.length()-2,str.length()-1);

        return result;

    }






    /*
    Integer Stringe çevrilirken hangi metotlar kullanılır?

    - int num =1234;
    String str = Integer.toString(num);
    or
    - String str2 = String.valueOf(num);
     */


}
