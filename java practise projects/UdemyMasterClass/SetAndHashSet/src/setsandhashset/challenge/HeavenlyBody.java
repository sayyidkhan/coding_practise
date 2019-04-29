package setsandhashset.challenge;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;
    private final String bodyField;

    public HeavenlyBody(String name, double orbitalPeriod,String bodyField) {

        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();
        this.bodyField = bodyField;

    }

    @Contract(pure = true)
    public String getBodyField() {
        return bodyField;
    }

    @Contract(pure = true)
    public String getName() {
        return name;
    }

    @Contract(pure = true)
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellite.add(moon);
    }

    @NotNull
    @Contract(" -> new")
    public Set<HeavenlyBody> getSatellite(){
        return new HashSet<>(this.satellite);
    }

    // we need to override the existing equals method
    // in order to take advantage
    // press windows + n to overrides the equal method
    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            System.out.println("successfully added, shared the same hashcode");
            return true; // comparing the same object // this refers to the class
        }


        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || ( obj.getClass() != this.getClass() ) ){ // obj.getClass() != this.getClass()
            // just compares that they are not the same
            System.out.println("unable to add object does not share the same hashcode");
            return false; // to return false because they are not the same class Object
        }


        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    // override hashCode
    // a hashCode performs faster than a linkedList
    @Override
    public int hashCode() {
        int hashCodeVal = this.name.hashCode()  + 57;
        System.out.println("hashcode called " + (hashCodeVal));
        return hashCodeVal; // a number is added so that a non-zero number is returned
    }

    private class SubHeavenlyBody{
        private String apple;

        public SubHeavenlyBody(String apple) {
            this.apple = apple;
        }

    }

}
