package day04;

public class GasStation {
    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int fillTank(Car car, int amount) {
        car.setLastTank(amount);
        return price * amount;
    }
}
