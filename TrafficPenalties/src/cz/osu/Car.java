package cz.osu;

public class Car {
    private String SPZ;
    private ActionType action;
    private int speed;


    public Car(String SPZ, ActionType action, int speed) {
        this.SPZ = SPZ;
        this.action = action;
        this.speed = speed;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public ActionType getAction() {
        return action;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
