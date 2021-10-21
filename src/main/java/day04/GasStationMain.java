package day04;

import java.util.Scanner;

public class GasStationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        System.out.println("Mennyi egy liter benzin ára?");
        int price = scanner.nextInt();

        GasStation gasStation = new GasStation(price);

        System.out.println("Hány liter benzint tankolsz?");
        int amount = scanner.nextInt();

        int payed = gasStation.fillTank(car, amount);
        System.out.println("Fizetendő összeg: " + payed);

        System.out.println("Hány km-t mentél egy tank üzemanyaggal?");
        int driven = scanner.nextInt();
        car.setDistanceTraveled(driven);

        double average = car.averageGasConsumption();
        System.out.println(("Az autó átlagfogyasztása: " + average + " l/100 km"));
    }




}
