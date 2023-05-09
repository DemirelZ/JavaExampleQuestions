import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class EnCokSayi {

    public static void main(String[] args) {

        int [] arrExample={2,3,5,6,8,8,3,3};

        System.out.println(enCokSayiyiBulanMetot(arrExample));


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

}
