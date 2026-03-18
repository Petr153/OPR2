package cz.osu;

import java.util.ArrayList;

public class FineManager {
    public ArrayList<Fine> checkViolations(Car car, Location location) {
        ArrayList<Fine> fines = new ArrayList<>();

        for (TrafficSign sign : location.getSigns()) {
            if (sign.isViolating(car)) {
                fines.add(new Fine(car, sign, 2000));
            }
        }
        return fines;
    }

}
