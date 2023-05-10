public class HarfCikarma {


    public static void main(String[] args) {

        System.out.println(IstediginHarfiCikar("Merhaba", "a"));

    }

    //Kullanıcıdan bir kelime ve bir harf alın kelimenizin
    // içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    //(Merhaba, a)  Merhb

    public static String IstediginHarfiCikar(String word, String alphabet){

        String[] splitWord = word.split("");

        String depo="";
        for (int i = 0; i < splitWord.length; i++) {

            if(!splitWord[i].equals(alphabet)){

                depo+=splitWord[i];

            }

        }

        return depo;
    }
}
