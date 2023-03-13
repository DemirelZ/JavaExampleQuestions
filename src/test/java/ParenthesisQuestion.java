public class ParenthesisQuestion {


    public static void main(String[] args) {

        String prntz = ")()(";

        parenthesiss(prntz);


    }


    public static void parenthesiss(String str) {

        String[] splitStr = str.trim().split("");

        if (splitStr[0].equals(")")) {

            System.out.println(str + " is not valid");

        } else {

            String acmaParantez = "(";
            String kapamaParantez = ")";
            int acmaP = 0;
            int kapamaP = 0;

            for (int i = 0; i < splitStr.length; i++) {

                if (acmaParantez.equals(splitStr[i])) {
                    acmaP++;
                } else if (kapamaParantez.equals(splitStr[i])) {
                    kapamaP++;
                }
            }

            if (acmaP == kapamaP) {
                System.out.println(str + " is valid");
            } else {
                System.out.println(str + " is not valid");
            }
        }

    }


}
