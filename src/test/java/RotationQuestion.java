import java.util.ArrayList;
import java.util.List;

public class RotationQuestion {

    public static void main(String[] args) {

        System.out.println(isRotation("car", "car"));

    }


    //which method would you use to learn if a string is a rotation of another string?
    //rotation of car --> car, arc, rca
    // sari --> sari, aris, risa, isar

    public static boolean isRotation(String word, String rotation){


        List<String> list=new ArrayList<>();

        System.out.println(list);


        for (int i = 0; i < word.length(); i++) {

            word = word.substring(1) + word.substring(0, 1);

            list.add(word);

        }

        System.out.println(list);

        return list.contains(rotation);

    }

    public static boolean isRotation2(String word, String rotation){

    if(word.length()!=rotation.length()) return false;
    return (word+word).contains(rotation);

    }



}
