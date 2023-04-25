public class ComplateWithPoint {

    public static void main(String[] args) {

        complateWithPoint("za");

    }

    //Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static void complateWithPoint(String str){

        if(str.length()<5){

            String[] splitStr = str.split("");

            String newStr=str+"";

            for (int i = splitStr.length; i < 5; i++) {
                newStr+=".";
            }

            System.out.println(newStr);


        }else {

            System.out.println("5 veya 5 den büyük olduğundan dolayı sorun yok");
        }

    }
}
