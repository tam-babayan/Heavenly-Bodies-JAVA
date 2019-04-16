package com.tbabayan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody body = new Planet("Mercury", 88);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new Planet("Venus", 225);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new Planet("Earth", 365);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        HeavenlyBody bodySatelite = new Satellite("Moon", 27);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite);

        body = new Planet("Mars", 687);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        bodySatelite = new Satellite("Deimos", 1.3);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Mars

        bodySatelite = new Satellite("Phobos", 0.3);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Mars

        body = new Planet("Jupiter", 4332);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        bodySatelite = new Satellite("Io", 1.8);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Jupiter

        bodySatelite = new Satellite("Europa", 3.5);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Jupiter

        bodySatelite = new Satellite("Ganymede", 7.1);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Jupiter

        bodySatelite = new Satellite("Callisto", 16.7);
        solarSystem.put(bodySatelite.getName(), bodySatelite);
        body.addSatellite(bodySatelite); // body is still Jupiter

        body = new Planet("Saturn", 10759);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new Planet("Uranus", 30660);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new Planet("Neptune", 165);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new Planet("Pluto", 248);
        solarSystem.put(body.getName(), body);
        planets.add(body);


        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        body = solarSystem.get("Earth");
        System.out.println("Satellites of " + body.getName());
        for(HeavenlyBody jupiterSatellites: body.getSatellites()) {
            System.out.println("\t" + jupiterSatellites.getName());
        }

        Set<HeavenlyBody> satellites = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            satellites.addAll(planet.getSatellites());
        }

        System.out.println("All Satellites");
        for(HeavenlyBody satellite : satellites) {
            System.out.println("\t" + satellite.getName());
        }

        HeavenlyBody pluto1 = new DwarfPlanet("Pluto", 842);
        planets.add(pluto1);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(pluto1.equals(earth1));
        System.out.println(earth1.equals(pluto1));

    }
}
