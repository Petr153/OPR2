package cz.osu;

public class Fine {
    private Car car;
    private String reason;
    private int amount;

    public Fine(Car car, String reason, int amount) {
        this.car = car;
        this.reason = reason;
        this.amount = amount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
