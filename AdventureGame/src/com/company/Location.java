package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;

        exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location) {

        exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
        //това се използва за върне копие на exits. По този начин оригиналния exits не може да бъде променен от външна страна;
    }
}
