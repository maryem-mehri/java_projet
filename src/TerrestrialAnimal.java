
public class TerrestrialAnimal {
    private int nbrLegs;
    public TerrestrialAnimal(){}
    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super();
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
