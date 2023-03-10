import java.util.*;

public class FarklıOlan {

    public static void main(String[] args) {

        int [] sayilar={12,13,14,15,16,17,18,19,20,12,13,14,15,16,17,18,19};

        findDifferentInArray(sayilar);

    }





    public static Integer findDifferentInArray(int[] arr){

        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            list.add(arr[i]);
        }
        System.out.println("set = " + set);
        System.out.println("list = " + list);



        return 0;

    }
}
