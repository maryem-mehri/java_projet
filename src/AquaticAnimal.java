import java.util.Objects;

public abstract class AquaticAnimal extends Animal {
    private String habitat;
    public AquaticAnimal() {
        super();

    }
    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public abstract void swim() ;
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaticAnimal)) {
            return false;
        }
        AquaticAnimal other = (AquaticAnimal) obj;
        return super.equals(obj) &&
                Objects.equals(habitat, other.habitat);
    }
}
