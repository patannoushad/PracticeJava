package Logics;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args){

        int a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a");
        a=in.nextInt();

        System.out.println("Enter b");
        b=in.nextInt();

        System.out.println("Enter c");
        c=in.nextInt();

        if(a>b && a>c){
            System.out.println("a is the biggest number "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is the bigget numbr  "+b);
        }
        else if (c>a && c>b){
            System.out.println("c is the biggest number"+c);
        }

    }
}
