package Logics;

public class Operators {

    public static void main(String[] args) {

        int a = 5, b = 10, c = 15, d = 20, e = 25;

        //******************************- Arithmetic_operations -*********************************

            System.out.println("--------Arithmetic Operators-------");
            System.out.println(a + b);  //  15
            System.out.println(a - b);  //  -5
            System.out.println(b - a);  //  5
            System.out.println(b / a);  //  2
            System.out.println(b * a);  //  50
            System.out.println(b % a);  //  0

        //***********************************- Relational_operations -*********************************

            System.out.println("------Relational Operators-------");
            System.out.println(a==b);
            System.out.println(a!=b);
            System.out.println(a>=b);
            System.out.println(a<=b);


        //***********************************- Assignment_operations -*********************************

            System.out.println("----------logical operators---------");
            System.out.println(b>a && c>a);         //and 2 trues vasthey ney true
            System.out.println(b>a || c>d);         //Or 2 false vasthey ney false
             System.out.println(b>a != c>a);


    }
}
