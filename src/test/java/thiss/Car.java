package thiss;

public class Car {

    String model;
    String color;
    int price;
    static String milage;

    public void startCar(String model,String color){
        this.model=model;
        this.color=color;
        System.out.println(model +" Car is started   ---------      "+color);
    }
    public void stopCar(){
        System.out.println(color + "  car is stopped ");
    }
    public static void speed(){
        System.out.println( milage +  "  car is static milage");
    }
}
