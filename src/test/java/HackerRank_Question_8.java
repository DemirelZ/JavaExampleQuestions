import java.util.Scanner;

public class HackerRank_Question_8 {

    /*
    You are given an integer n, you have to convert it into a string.
    Please complete the partially completed code in the editor.
    If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
    n can range between -100 to 100 inclusive.

    Sample Input
    100

    Sample Output
    Good job
     */

    public static void main(String[] args) {

      //  goodJobQuestion(100);



        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();

        String s=Integer.toString(n);
        int s1 = Integer.parseInt(s);

        if(-100<=s1 && s1<=100){

            System.out.println("Good job");

        }else {

            System.out.println("Wrong answer");
        }





    }

    public static void goodJobQuestion(Integer n){


        String s=Integer.toString(n);
        int s1 = Integer.parseInt(s);

        if(-100<=s1 && s1<=100){

            System.out.println("Good job");

        }else {

            System.out.println("Wrong answer");
        }

    }
}
