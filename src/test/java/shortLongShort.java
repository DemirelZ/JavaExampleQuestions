import java.util.Scanner;

public class shortLongShort {

    public static void main(String[] args) {

        uzunOlanOrtaya("mehmet", "ali");

    }


    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2
    // defa uzun kelimeyi ortada 30 defa kısa kelimeyi
    // tekrar sonda 2 defa yazdıran metodu yazınız.

    public static void uzunOlanOrtaya(String str1, String str2){

        if (str1.length()<str2.length()){

            for (int i = 0; i < 2; i++) {
                System.out.print(str1);
            }
            for (int i = 0; i < 30; i++) {
                System.out.print(str2);
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(str1);
            }

        }else if (str1.length()>str2.length()) {

            for (int i = 0; i < 2; i++) {
                System.out.print(str2);
            }
            for (int i = 0; i < 30; i++) {
                System.out.print(str1);
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(str2);
            }

        }


    }
}
