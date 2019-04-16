package com.tbabayan;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.BodyType;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

     HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name  = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    // getters
     String getName() {
        return name;
    }

     double getOrbitalPeriod() {
        return orbitalPeriod;
    }

     Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

     BodyTypes getBodyType() {
        return bodyType;
    }

    // methods
     void addSatellite(HeavenlyBody satellite) {
        this.satellites.add(satellite);
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + this.bodyType.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObj = (HeavenlyBody) obj;
            if (this.name.equals(theObj.getName())) {
                return this.bodyType == theObj.getBodyType();
            }
        }
        return false;
     }

    @Override
    public String toString() {
        return this.name + " " + this.bodyType + " " + this.orbitalPeriod;
    }
}
