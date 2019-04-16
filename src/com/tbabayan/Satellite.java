package com.tbabayan;

public class Satellite extends HeavenlyBody {

    public Satellite(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.SATELLITE);
    }
}
