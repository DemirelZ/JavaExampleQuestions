import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysAndArrayList {
    public static void main(String[] args) {








        // day 26 dan devam et

        //System.out.println(task_28("Mmerhhahbaeeeeeeeeeeeee"));

        String [] isimler=new String[7];

        isimler[0]="Zehra";
        isimler[1]="Mehmet";
        isimler[2]="Zehra";
        isimler[3]="Zafer";
        isimler[4]="Ayşe";
        isimler[5]="Mustafa";
        isimler[6]="Zehra";

//        int count=0;
//        for (int i = 0; i < isimler.length; i++) {
//
//            if(isimler[i].toLowerCase().equals("zehra")){
//
//                count++;
//            }
//        }
//        System.out.println("count = " + count);

        //20 boyutunda bir dizi oluşturun ve
// her bir index’ine random 0 ile 100
// arasın bir değer atayın. Sonrasında 17 index
// numarasındaki veriyi ekrana yazdırın.

//        int [] sayilar=new int[20];
//        Random random=new Random();
//
//        int cift=0;
//        int tek=0;
//        for (int i = 0; i < sayilar.length; i++) {
//
//            sayilar[i]= random.nextInt(100);
//
//            if(sayilar[i]%2==0){
//                cift++;
//
//            }else{
//                tek++;
//            }
//        }
//
//        System.out.println("cift = " + cift);
//        System.out.println("tek = " + tek);

//        String str="merhaba java insanları";
//
//        String[] array = str.split(" ");
//
//        for (String s:array) {
//            System.out.println("s = " + s);
//        }
//        System.out.println("-------------------------------");
//        array[1]="yurdum";
//
//        System.out.println(Arrays.toString(array));

//        int[] arrys = {1,2,3,4,5,6,7,8,9};
//
//        int[] ints = Arrays.copyOfRange(arrys, 2, 6);
//
//        System.out.println(Arrays.toString(ints));
//        System.out.println(arrys.length);

//        int[] arrys2 = {9,7,4,5,8,7,1,11};
//        Arrays.sort(arrys2);
//        System.out.println(Arrays.toString(arrys2));
//
//        Arrays.fill(arrys2,10);
//        System.out.println(Arrays.toString(arrys2));
//        Arrays.fill(arrys2,2,5,5);
//        System.out.println(Arrays.toString(arrys2));

        int[] sayılar2 = {100,33,48,37777,1,5};

       // System.out.println("bigOne(sayılar2) = " + bigOne(sayılar2));

        System.out.println(countLetter("karabacak"));

//        String word = "karabacak";
//        ArrayList<String> letters = new ArrayList<>();
//
//        for (int i = 0; i < word.length(); i++) {
//            String letter = word.substring(i, i + 1);
//            int count = 0;
//            for (int j = 0; j < word.length(); j++) {
//                if (word.substring(j, j + 1).equals(letter)) {
//                    count++;
//                }
//            }
//            letters.add(count + letter);
//        }
//        System.out.println(letters);

        String str="karabacak";
       // String substring = str.substring(0, 1);

        //System.out.println(str);

        int[] xarr={10,30,20,5,50};

        System.out.println("kucuktenBuyugeSirala(xarr) = " + kucuktenBuyugeSirala(xarr));


    }




    //karabacak --> 2k, 4a, 1r, 1b, 1c

    public static List<String> countLetter(String str){

        List<String> list=new ArrayList<>();
        String letter="";
        int count=0;

        while (!str.isEmpty()){

            String substring = str.substring(0, 1);
            letter=substring;
            int i = (str.length()) - (str.replaceAll(substring, "").length());
            count=i;

            list.add(letter+""+count);



        }
        return list;
    }




    //    İnt arry in en büyük elemanının döndüren bir method yazın

    static int bigOne(int [] arr){

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static String task_28(String str){
        str=str.replace(" ","").toLowerCase();

        String result="";

        while(str.length()!=0){
            int count=1;
            for (int j=1; j<str.length(); j++ ){
                if(str.charAt(0)==str.charAt(j)){
                    count++;
                }
            }
            result+=count+str.substring(0,1);
            str=str.replace(str.substring(0,1),"");
        }
        return result;

    }


    //Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)


    public static int[] kucuktenBuyugeSirala(int[] arr){

        int depo=0;
        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    depo=arr[i];
                    arr[i]=arr[j];
                    arr[j]=depo;
                }

            }
        }
        return arr;

    }


}
