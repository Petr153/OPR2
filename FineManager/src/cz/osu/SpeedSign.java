package cz.osu;

public class SpeedSign implements TrafficSign {
    private int speedLimit;

    public SpeedSign(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public boolean isViolating(Car car) {
        return car.getSpeed() > speedLimit;
    }
}
