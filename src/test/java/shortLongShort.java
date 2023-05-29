import java.util.Scanner;

public class shortLongShort {

    public static void main(String[] args) {

        uzunOlanOrtaya("mehmet", "ali");

        //------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kısa kelimeyi girin: ");
        String kisaKelime = scanner.next();
        System.out.print("Uzun kelimeyi girin: ");
        String uzunKelime = scanner.next();

        String sonuc = yazdir(kisaKelime, uzunKelime);
        System.out.println("Sonuç: " + sonuc);

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

    public static String yazdir(String kisaKelime, String uzunKelime) {
        StringBuilder sb = new StringBuilder();

        sb.append(kisaKelime); // Kısa kelimeyi başta 1. kez ekle
        sb.append(kisaKelime); // Kısa kelimeyi başta 2. kez ekle

        for (int i = 0; i < 30; i++) {
            sb.append(uzunKelime); // Uzun kelimeyi ortada 30 kez ekle
        }

        sb.append(kisaKelime); // Kısa kelimeyi sonda 1. kez ekle
        sb.append(kisaKelime); // Kısa kelimeyi sonda 2. kez ekle

        return sb.toString();
    }
}
