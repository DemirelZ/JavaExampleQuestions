public class BasamakSayisi {

    //Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız

    public static void main(String[] args) {


        basamakSayisi(123456789);
    }

    public static void basamakSayisi(String sayi){


        int count=0;
        for (int i = 0; i < sayi.length(); i++) {
            count++;
        }

        System.out.println("Sayı " + count + " basamaklıdır");
    }
    public static void basamakSayisi(int sayi){

        String sayi2=Integer.toString(sayi);
        int count=0;
        for (int i = 0; i < sayi2.length(); i++) {
            count++;
        }

        System.out.println("Sayı " + count + " basamaklıdır");
    }
}
