package day04;

public class Car {
    private double lastTank;
    private double distanceTraveled;

    public void setLastTank(double gasAmount) {
        this.lastTank = gasAmount;
    }
    public void setDistanceTraveled(double distance) {
        this.distanceTraveled = distance;
    }

    public double averageGasConsumption() {
        return lastTank / distanceTraveled * 100;
    }
}
