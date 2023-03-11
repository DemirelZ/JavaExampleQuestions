import java.util.*;

public class FarklıOlan {

    /*
    Arrayin içerisindeki dublicate olmayan sayıyı veren metodu yazınız
     */

    public static void main(String[] args) {

        int[] sayilar = {35, 45, 55, 65, 75, 35, 45, 55, 65, 75, 25};

        System.out.println("findDifferentInArray(sayilar) = " + findDifferentInArray(sayilar));

    }


    public static Integer findDifferentInArray1(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        //System.out.println("set = " + set);
        //System.out.println("list = " + list);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            map.put(count, list.get(i));
            //map.put(list.get(i), count );
        }
        //System.out.println("map = " + map);

        return map.get(1);
    }

    public static Integer findDifferentInArray(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(count, arr[i]);
            //map.put(arr[i], count );
        }
        //System.out.println("map = " + map);

        return map.get(1);
    }
}
