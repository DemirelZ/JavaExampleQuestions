import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class EnCokSayi {

    public static void main(String[] args) {

        int [] arrExample={2,3,3,3,6,6,5,6,3};

        System.out.println(enCokSayiyiBulanMetot(arrExample));

      //  System.out.println(enCokBulunanSayi(arrExample));


    }




    //Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
    // (eşitlik durumda herhangi birini alabilir,1 den  bulunmuyorsa -1 döndürecek)
    //[2,3,3,3,6,6,5,6,3]  3
    //
    //[2,4,5,8,8]  8
    //
    //[2,4,5,8]  -1

    public static int enCokSayiyiBulanMetot(int [] arr){

        int enCok=-1;
        int count;
        int adet=1;
        for(int i=0; i<arr.length; i++){
            count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>adet){
                enCok=arr[i];
                adet=count;
            }
        }
        return enCok;

    }

    public static int enCokBulunanSayi(int[] arr) {
        int enCokTekrarSayisi = 0;
        int enCokTekrarSayininDegeri = -1;

        for (int i = 0; i < arr.length; i++) {
            int tekrarSayisi = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    tekrarSayisi++;
                }
            }
            if (tekrarSayisi > enCokTekrarSayisi) {
                enCokTekrarSayisi = tekrarSayisi;
                enCokTekrarSayininDegeri = arr[i];
            }
        }

        if (enCokTekrarSayisi == 0) {
            return -1;
        }

        return enCokTekrarSayininDegeri;
    }

}
