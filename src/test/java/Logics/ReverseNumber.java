package Logics;

import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {

        int num;
        int remainder;
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num =sc.nextInt();

        while (num >0){
            remainder =num%10;
            result = result * 10 + remainder;
            num = num/10;
        }
        System.out.println("Reverse of the number is :  " +result);
    }
}
