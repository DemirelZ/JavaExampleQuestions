public class RakamlariBul {

    public static void main(String[] args) {

        String exampleStr="asd123dfg678ghjjklş90";

        System.out.println(rakamlariAyir(exampleStr));

    }


    public static String rakamlariAyir(String str){

        String depo="";
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){

                depo+=str.charAt(i);
            }

        }

        return depo;
    }
}
