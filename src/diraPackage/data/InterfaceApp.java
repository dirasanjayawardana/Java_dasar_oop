package diraPackage.data;

public class InterfaceApp {
    public static void main(String[] args) {
        InterfaceCar car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
