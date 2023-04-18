public class ArdArdaUc {


    public static void main(String[] args) {


        int[] exampleArr = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        int[] exampleArr1 = {2,4,5,8,8};
        int[] exampleArr2 = {1,2};

        System.out.println(siraliUcluVarMi(exampleArr2));

    }

    //Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
    //[2,3,3,4,5,6,5,6,3]  true

    //[2,4,5,8,8]  false

    //[1,2,3]  true

    //[1,2]  false


    public static boolean siraliUcluVarMi(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return true;
            }

        }

        return false;
    }

}
