package cz.osu;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<TrafficSign> signs;

    public Location(String name) {
        this.name = name;
        this.signs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TrafficSign> getSigns() {
        return signs;
    }

    public void setSigns(ArrayList<TrafficSign> signs) {
        this.signs = signs;
    }

    public void addSign(TrafficSign sign) {
        this.signs.add(sign);
    }
}
