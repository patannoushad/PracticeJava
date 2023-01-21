package JavaConcepts;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a = sc.nextInt();


        switch (a) {
            case 1:
                System.out.println("Print the value of the case 1 : "+a);
                break;
            case 2:
                System.out.println("pront the value of the Case 2 : "+a);
                break;
            case 3:
                System.out.println("Print the value of the case 3 : "+a);
                break;
            default:
                System.out.println("print the value of the default : "+a);
        }


    }
}
