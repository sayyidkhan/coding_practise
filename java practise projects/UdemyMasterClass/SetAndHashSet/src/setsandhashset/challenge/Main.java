package setsandhashset.challenge;

import java.util.*;

     /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
        */

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        addToSolarSystem("Mercury",88,"planet");
        addToSolarSystem("Venus",225,"planet");
        addToSolarSystem("Earth",365,"planet");
        addMoonToPlanetAndSolarSystem("Earth","Moon", 27, "moon");
        addToSolarSystem("Mars",687,"planet");
        addMoonToPlanetAndSolarSystem("Mars","Deimos", 1.3, "moon");
        addMoonToPlanetAndSolarSystem("Mars","Phobos", 0.3, "moon");
        addToSolarSystem("Jupiter",4332,"planet");
        addMoonToPlanetAndSolarSystem("Jupiter","Io", 1.8, "moon");
        addMoonToPlanetAndSolarSystem("Jupiter","Europa", 3.5, "moon");
        addMoonToPlanetAndSolarSystem("Jupiter","Ganymede", 7.1, "moon");
        addMoonToPlanetAndSolarSystem("Jupiter","Callisto", 16.7, "moon");
        addToSolarSystem("Saturn",10759,"planet");
        addToSolarSystem("Uranus",30660,"planet");
        addToSolarSystem("Neptune",165,"planet");
        addToSolarSystem("pluto",248,"planet");


        //
        printPlanets(planets); // print all the planets

        /*
        HeavenlyBody body = solarSystem.get("Mars");
        printPlanets("Moons of " + body.getName() ,body.getSatellite()); // print all the moons on mars

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellite());
        }

        printPlanets("All Moons",moons); // print all moons

        HeavenlyBody pluto = new HeavenlyBody("Pluto",842,"planet");
        planets.add(pluto);

        printPlanets(planets); // get all the planets and return the name and the orbital period

        Object o = new Object();
        o.equals(o);
        "pluto".equals(o);
        */
        ///////////////////////////////////////////////////

    }



    public static void addToSolarSystem(String celestialObjectName, double orbitalPeriod, String typeOfCelestialObject){

        HeavenlyBody temp = new HeavenlyBody(celestialObjectName, orbitalPeriod,typeOfCelestialObject);
        solarSystem.put(celestialObjectName, temp);
        planets.add(temp);

    }

    public static void addMoonToPlanetAndSolarSystem(String planetName,String celestialObjectName,double orbitalPeriod,String typeOfCelestialObject){

        HeavenlyBody tempMoon = new HeavenlyBody(celestialObjectName, orbitalPeriod, typeOfCelestialObject);
        solarSystem.put(celestialObjectName, tempMoon);
        solarSystem.get(planetName).addMoon(tempMoon);

    }

    public static void printPlanets(String title,Set<HeavenlyBody> heavenlyBodyArrayList){
        System.out.println(title);
        for(HeavenlyBody heavenlyBodyObject : heavenlyBodyArrayList) {
            System.out.println("\t" + heavenlyBodyObject.getName());
        }
    }

    public static void printPlanets(Set<HeavenlyBody> heavenlyBodyArrayList){
        for(HeavenlyBody planet : heavenlyBodyArrayList){
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
    }

    public static void printExistingPlanet(Map<String,HeavenlyBody> solarSystem,String planet){
        System.out.println(solarSystem.get(planet).getName() + ": " + solarSystem.get(planet).getOrbitalPeriod());
    }


}
