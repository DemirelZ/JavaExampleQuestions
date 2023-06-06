public class BasamakSayisi {

    //Kullanıcıdan alınan sayının kaç basamaklı olduğunu bulan metodu yazınız

    public static void main(String[] args) {


        basamakSayisi("1");
    }

    public static void basamakSayisi(String sayi){


        int count=0;
        for (int i = 0; i < sayi.length(); i++) {
            count++;
        }

        System.out.println("Sayı " + count + " basamaklıdır");
    }
}
