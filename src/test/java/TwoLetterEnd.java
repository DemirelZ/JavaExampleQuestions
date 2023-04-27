public class TwoLetterEnd {

    public static void main(String[] args) {

        System.out.println(twoLetterToEnd("m"));

    }

    //Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2
    //harfi sonunda yer alıyorsa true almıyorsa false yazdırın.

    public static Boolean twoLetterToEnd(String str){

        if(str.length()<2){
            return false;
        }else if(str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }else {
            return false;
        }

    }

}
