package assingmentDS.animal;

/**
 * Created by pv42 on 24.04.2017.
 */
public final class Zebra extends LandMammal {
    public Zebra(String name) {
        super(name,"Zebra",false,false,false,2.1,false);
    }
    @Override
    public String toString() {
        return "Zebra{" +
                "name=" + getName() + ", " +
                "}";
    }
}
