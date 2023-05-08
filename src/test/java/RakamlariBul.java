public class RakamlariBul {

    public static void main(String[] args) {

        String exampleStr="as*d1+23ııuhkıh6775765dfg67/8ghjjklş90";

        System.out.println(rakamlariAyir(exampleStr));

    }

    // yazılan kelimenin içerinde sayıları yazdıran metodu yazınız
    // merha123ba     123
    // 123a23ff34    1232334
    //ASCII


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
