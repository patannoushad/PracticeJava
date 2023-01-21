package Class;

public class Demo {
    public static void main(String[] args) {

        Car C = new Car();
        C.color="blue";
        C.model="abc";
        C.Cost=300000;
        C.milage=120;

        C.startCar();
        C.stopCar("abc");
        C.stopCar(C.color);
        C.carDetails();
        C.carDetails();
    }
}
