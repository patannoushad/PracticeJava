package Class;

public class Car {

    String color;
    String model;
    int Cost;
    int milage;

    public void startCar(){
        System.out.println("car was started :  "+model);
    }
    public void stopCar(String model){
        System.out.println("car was stoped  :  "+model);
    }
    public void carDetails(){
        System.out.println("Colour of the car : "+color);
        System.out.println("model of the car :  "+model);
        System.out.println("cost of the car  :  "+Cost);
        System.out.println("milage of the car : "+milage);
    }

}
