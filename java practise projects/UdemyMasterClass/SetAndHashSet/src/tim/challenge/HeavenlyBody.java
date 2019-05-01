package tim.challenge;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

// remove final on the heavenlyBody so that it can be subclassed
public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }


    public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
        this.key = new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellite = new HashSet<>();

    }

    @Contract(pure = true)
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellite.add(moon);
    }

    public Key getKey() {
        return key;
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
            return true;
        }


        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name,bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        @Contract(pure = true)
        public String getName() {
            return name;
        }

        @Contract(pure = true)
        public BodyTypes getBodyType() {
            return bodyType;
        }


        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Contract(value = "null -> false", pure = true)
        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return ( this.bodyType == key.getBodyType() );
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }


}
