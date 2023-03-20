import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZerosToEnd {

    public static void main(String[] args) {


        Integer[] arr1 = {0, 2, 3, 5, 0, 4, 5};
        List<Integer> qlist = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("zerosToEnd(qlist) = " + allZerosGoToEnd(qlist));

    }


    // interview question
    // list içerindeki tüm sıfırları listin sonu yazan metotu yazınız
    // giriş: 0,2,3,5,0,4,5      çıkış: 2,3,5,4,5,0,0

    public static List<Integer> allZerosGoToEnd(List<Integer> list) {

        List<Integer> newList = new ArrayList<>();
        List<Integer> newList2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 0) {
                newList.add(list.get(i));
            } else {
                newList2.add(list.get(i));
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            newList2.add(newList.get(i));
        }

        return newList2;

    }
}
