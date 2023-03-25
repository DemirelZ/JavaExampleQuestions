import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveName {


    public static void main(String[] args) {

        String[] names = {"Ahmet", "Mehmet", "Zafer", "Ali", "mehmet"};

        List<String> list=new ArrayList<>(Arrays.asList(names));

        System.out.println("removeName(list, \"Mehmet\") = " + removeName(list, "Mehmet"));
    }

    // interview question: list içerisinde Mehmet olan tüm isimleri silin (iteratorle yapılacak)

    public static List<String> removeName(List<String> list, String str) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equalsIgnoreCase(str)) {
                iterator.remove();
            }

        }

        return list;
    }


}
