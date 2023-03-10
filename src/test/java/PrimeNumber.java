import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {

        //System.out.println("isThisPrime = " + isThisPrime(3));
        //allPrimeFromToNumber(17);

        int[] xarr={10,30,20,5,50,3};
        System.out.println(Arrays.toString(fromToMinMax(xarr)));

    }

    public static boolean isThisPrime(int i){

        if(i==0 || i==1){
            return false;
        }else {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void allPrimeFromToNumber(int i){

            for (int j = 0; j <= i; j++) {

                if(isThisPrime(j)){
                    System.out.print(j + " ");
                }
            }

    }

    //Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
    //10,30,20,5,50 0
    //5,30,20,10,50 1
    //5,20,30,10,50 2
    //5,20,30,10,50 3

    public static int [] fromToMinMax(int [] arr){

        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
