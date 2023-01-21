package Logics;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  :  ");
        String value=sc.next();

        String stg=value, rev= "";

        for (int i=stg.length()-1;i>=0;i--){

            rev = rev+ stg.charAt(i);
        }
        System.out.println(rev);




//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the org value :");
//        String org = sc.next();
//
//        int length = org.length();
//        String rev = " ";
//
//        for (int i=length-1;i>=0;i--){
//
//            rev = rev+org.charAt(i);
//        }
//        System.out.println(rev);
   }
}


//-------------
//        String st1= "Pathan", st2="Noushad";
//
//        System.out.println( );
//        StringBuffer s = new StringBuffer(st2);
//        System.out.println(s.reverse());

