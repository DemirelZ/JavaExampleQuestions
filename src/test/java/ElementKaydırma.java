import java.util.Arrays;

public class ElementKaydırma {

    /*
    Verilen bir arraydeki tüm elementleri bir sağa kaydırıp
    sondaki elementi de en başa taşıyacak bir method oluşturun
    Orn: Input [4,5,6,7]    output [7,4,5,6]
     */

    public static void main(String[] args) {

        int [] arrOrn= {4,5,6,7};

        System.out.println("arrOrn = " + Arrays.toString(arrOrn));



        //System.out.println(sondakiBasa(Arrays.toString(arrOrn)));

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
