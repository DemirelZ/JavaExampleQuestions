import java.util.Arrays;

public class ElementKaydırma {

    /*
    Verilen bir arraydeki tüm elementleri bir sağa kaydırıp
    sondaki elementi de en başa taşıyacak bir method oluşturun
    Orn: Input [4,5,6,7]    output [7,4,5,6]
     */

    public static void main(String[] args) {

        int [] arrOrn= {40,50,60,70,80,90,100,200,300};



        System.out.println(Arrays.toString(sondakiBasa(arrOrn)));

    }

    public static int [] sondakiBasa(int [] arr){

        int[] arrNew=new int[arr.length];
        arrNew[0]=arr[arr.length-1];
        for (int i = 0, j=1; i < arr.length-1; i++, j++) {

            arrNew[j]=arr[i];


        }

        return  arrNew;

    }


}
