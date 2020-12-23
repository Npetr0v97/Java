package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String name;
    private final String description;
    private final Map<Integer, String> exits;

    public Location(int locationID, String name, String description) {
        this.locationID = locationID;
        this.name = name;
        this.description = description;

        exits = new HashMap<Integer, String>();
    }


    public void addExit(int location, String direction) {
        exits.put(location, direction);
    }

    public String getName() {
        return name;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<Integer,String> getExits() {
        return new HashMap<Integer,String>(exits);
        //това се използва за върне копие на exits. По този начин оригиналния exits не може да бъде променен от външна страна;
    }
}
