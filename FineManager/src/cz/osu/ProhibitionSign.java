package cz.osu;

public class ProhibitionSign implements TrafficSign {
    private ActionType prohibitedAction;

    public ProhibitionSign(ActionType prohibitedAction) {
        this.prohibitedAction = prohibitedAction;
    }
    public ActionType getprohibitedAction() {
        return prohibitedAction;
    }
    public void setprohibitedAction(ActionType prohibitedAction) {
        this.prohibitedAction = prohibitedAction;
    }

    @Override
    public boolean isViolating(Car car) {
        return car.getAction().equals(prohibitedAction);
    }
}
