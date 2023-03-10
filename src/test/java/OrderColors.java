import java.util.*;

public class OrderColors {


    public static void main(String[] args) {
        String str = "red2 blue5 black4 green1 gold3 purple8 pink6";
        String str2 = "gold2 black1 white3";
        //System.out.println(Arrays.toString(orderClr(str)));

        //System.out.println("orderClr(str) = " + orderClr(str));
        System.out.println("orderColors3(str) = " + orderColors3(str));

    }



    /*
    Input str = "red2 blue5 black4 green1 gold3"
    OutPut str = "green red gold black blue"


     */

    public static String orderClr(String colorsWithNumbers) {
        String[] unOrders = colorsWithNumbers.trim().toLowerCase().split(" ");
        Map<Integer,String> newMap=new HashMap<>();

        for (int i = 0; i < unOrders.length; i++) {
            newMap.put(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 1)), unOrders[i].substring(0,unOrders[i].length()-1) );
        }
        System.out.println("newMap = " + newMap);

        String str="";
        for (String value : newMap.values()) {
            str+=value + " ";
        }

        return str ;
    }


    public static String orderColors3(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(words[i].length() - 1) + words[i];
        }
        Arrays.sort(words);
          System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace(words[i].substring(0, 1), "");
        }
         System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result.trim();
    }



    public static String orderClr2(String colorsWithNumbers) {
        String[] unOrders = colorsWithNumbers.trim().toLowerCase().split(" ");

        Integer[] newArr = new Integer[unOrders.length];
       // String[] newArr2 = new String[unOrders.length];
        Map<Integer,String> newMap=new HashMap<>();


        String[] newArr2 = new String[unOrders.length];
        for (int i = 0; i < unOrders.length; i++) {
            String[] split = unOrders[i].split("");
            for (int j = 0; j < split.length; j++) {


            }

        }


        for (int i = 0; i < unOrders.length; i++) {

            if(Character.isDigit(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 2)))){
                newMap.put(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 2)), unOrders[i].substring(0,unOrders[i].length()-2) );

            }else if(Character.isDigit(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 1)))){

                newMap.put(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 1)), unOrders[i].substring(0,unOrders[i].length()-1) );
            }




        }

        String str="";
        for (String value : newMap.values()) {
            str+=value + " ";
        }

        return str ;
    }


}
