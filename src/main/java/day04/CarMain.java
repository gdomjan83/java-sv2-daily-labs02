package day04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.setLastTank(45);
        car.setDistanceTraveled(560);
        System.out.println(car.averageGasConsumption());
    }
}
