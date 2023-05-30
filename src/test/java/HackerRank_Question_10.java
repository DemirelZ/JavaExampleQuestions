import java.util.Scanner;

public class HackerRank_Question_10 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else System.out.println("No");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));


    }
}
