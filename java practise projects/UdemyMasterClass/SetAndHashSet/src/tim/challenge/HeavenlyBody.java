package tim.challenge;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

// remove final on the heavenlyBody so that it can be subclassed
public class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();
        this.bodyType = bodyType;
    }



    @Contract(pure = true)
    public String getName() {
        return name;
    }

    @Contract(pure = true)
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellite.add(moon);
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    @NotNull
    @Contract(" -> new")
    public Set<HeavenlyBody> getSatellite(){
        return new HashSet<>(this.satellite);
    }

    // using final to prevent equals issue
    @Contract(value = "null -> false", pure = true)
    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            System.out.println("successfully added, shared the same hashcode");
            return true; // comparing the same object // this refers to the class
        }


        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())) {
                return this.bodyType == theObject.getBodyType();
            }
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }

}
