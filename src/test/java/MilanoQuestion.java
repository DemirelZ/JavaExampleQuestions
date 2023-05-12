import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MilanoQuestion {

/*
String str"128 2 3693 65 89 25 10" str içerisindeki boşlukla ayrılmış sayıların
sayı değerleri toplanarak küçükten büyüğe dizili olarak
yeniden bir stringe tanımlayan metod nedir?
Bu soru için cevap String result="1 2 7 11 11 17 21" şeklinde olmalıdır.
 */

    public static void main(String[] args) {

        //System.out.println("sayiRakamToplami(\"128\") = " + sayiRakamToplami("2"));

        //System.out.println("sumOfString3(\"128 2 3693 65 89 25 10\") = " + sumOfString3("128 2 3693 65 89 25 10"));

        System.out.println("degerleriSiralama(\"128 2 3693 65 89 25 10\") = " + degerleriSiralama("128 2 3693 65 89 25 10"));
        //System.out.println("Arrays.toString(degerleriSiralama(\"128 2 3693 65 89 25 10\")) = " + Arrays.toString(degerleriSiralama("128 2 3693 65 89 25 10")));

    }


    public static int sayiRakamToplami(String sayi){

        String trimSayi = sayi.trim();
        String[] rakamlar = trimSayi.split("");
        int sum=0;
        for (int i = 0; i < trimSayi.length(); i++) {
            sum += Integer.parseInt(rakamlar[i]);
        }
        return sum;
    }

    public static String degerleriSiralama(String str){

        String[] s = str.trim().split(" ");
        int[] newArr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            newArr[i]=sayiRakamToplami(s[i]);
        }

        Arrays.sort(newArr);
        String siralama="";
        for (int i = 0; i < newArr.length; i++) {
            siralama+=String.valueOf(newArr[i]);
            siralama+=" ";
        }

        return siralama.trim();
    }

    public static String sumOfString3(String str){   // String str ="128 2 3693 65 89 25 10";

        String[] strArr =str.split(" ");

        int count=0;

        int[] intArr = new int[strArr.length];

        for (int i=0; i<strArr.length; i++){
            for (int j=0; j<strArr[i].length(); j++){
                count += Integer.parseInt(strArr[i].charAt(j)+"");
            }
            intArr[i]=count;
            count=0;
        }
        Arrays.sort(intArr);

        String result = "";
        for (int i:intArr) {
            result+= Integer.toString(i)+" ";
        }

        return result;
    }

    public static String sortAndSum(String str) {
        // Split the string into individual numbers
        String[] nums = str.split(" ");

        // Convert the numbers to integers and calculate the sum
        int sum = 0;
        int[] intNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i]);
            sum += intNums[i];
        }

        // Sort the numbers in ascending order
        Arrays.sort(intNums);

        // Create a new string with the sorted numbers
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intNums.length; i++) {
            sb.append(intNums[i]);
            if (i < intNums.length - 1) {
                sb.append(" ");
            }
        }

        // Append the sum to the end of the string
        sb.append(" ").append(sum);

        // Return the final string
        return sb.toString();
    }



}
