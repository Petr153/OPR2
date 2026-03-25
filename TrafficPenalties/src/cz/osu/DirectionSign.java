package cz.osu;

public class DirectionSign implements TrafficSign {
    private ActionType allowedDirection;

    public DirectionSign(ActionType allowedDirection) {
        this.allowedDirection = allowedDirection;
    }

    public ActionType getAllowedDirection() {
        return allowedDirection;
    }

    public void setAllowedDirection(ActionType allowedDirection) {
        this.allowedDirection = allowedDirection;
    }


    @Override
    public boolean isViolating(Car car) {
        return !car.getAction().equals(allowedDirection);
    }

    @Override
    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {
        return "DirectionSign{" +
                "allowedDirection=" + allowedDirection +
                '}';
    }
}
