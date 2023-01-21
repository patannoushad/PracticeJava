package Inheritance;

public class Demo extends Pug {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.Bread = "abc";
        d.Cost = 1234;
        d.color = "white";
        d.eatDog();
        d.sleep();
        System.out.println("------------------------");

        Pug p = new Pug();
        p.Bread = "mno";
        p.Cost = 30000;
        p.color = "grey";
        p.eatDog();
        p.sleep();
    }}