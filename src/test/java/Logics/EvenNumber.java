package Logics;


import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int num ;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  :");
        num = sc.nextInt();

        for(i =0;i<=num;i++){
            if(i% 2 ==0){
                System.out.println("Even number is : "+i);
            }else {
                System.out.println("Odd number is  : "+i);
            }
        }
    }
}
