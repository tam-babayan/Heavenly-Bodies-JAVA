package com.tbabayan;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.BodyType;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    void addSatellite(HeavenlyBody satellite) {
        if (satellite.getBodyType() == BodyTypes.SATELLITE) {
            this.getSatellites().add(satellite);
        }
    }
}
