package com.company;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBodyClass {

    public static final int PLANET = 1, MOON = 2, STAR = 3;
    private final String name;
    private final double orbitalPeriod;
    private final String bodyType;
    private final Set<HeavenlyBodyClass> satellites;

    public HeavenlyBodyClass(String name, double orbitalPeriod, int bodyType) {
        this.name = name;
        switch (bodyType) {

            case PLANET:
                this.bodyType = "planet";
                break;
            case MOON:
                this.bodyType = "moon";
                break;
            case STAR:
                this.bodyType = "star";
                break;
            default:
                this.bodyType ="planet";
                break;
        }
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public boolean addMoon(HeavenlyBodyClass moon) {

        return this.satellites.add(moon);
    }

    public String getName() {

        return name;
    }

    public double getOrbitalPeriod() {

        return orbitalPeriod;
    }

    public Set<HeavenlyBodyClass> getSatellites() {

        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;

        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if (obj==null || obj.getClass() != this.getClass()) {

            return false;
        }

        String objName = ((HeavenlyBodyClass) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called");
        return this.name.hashCode() + 57;
    }
}
