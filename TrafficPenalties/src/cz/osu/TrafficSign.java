package cz.osu;

public interface TrafficSign {
    boolean isViolating(Car car);


    String getDescription();
}
