
public class Dolphin extends AquaticAnimal {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super();
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
