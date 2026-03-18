package cz.osu;

public class Fine {
    private Car car;
    private TrafficSign violatedSign;
    private int amount;

    public Fine(Car car, TrafficSign violatedSign, int amount) {
        this.car = car;
        this.violatedSign = violatedSign;
        this.amount = amount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public TrafficSign getViolatedSign() {
        return violatedSign;
    }

    public void setViolatedSign(TrafficSign violatedSign) {
        this.violatedSign = violatedSign;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
