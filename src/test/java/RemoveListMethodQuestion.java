import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveListMethodQuestion {


    public static void main(String[] args) {

        Integer[] example = {2,4,8,7,6,5,10};

        System.out.println(clearAllList2(Arrays.asList(example), 10));


    }



    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)


    public static List<Integer> clearAllList(List<Integer> list, Integer data){

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }

        }
        return list2;

    }

    public static List<Integer> clearAllList2(List<Integer> list, Integer data){


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }

        }
        return list;

    }

    public static boolean removeListMethod7(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }

}
