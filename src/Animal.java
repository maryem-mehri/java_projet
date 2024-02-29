public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public Animal() {

    }

    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mamal){
        isMammal=mamal;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif. La valeur par défaut de 0 sera utilisée.");

        }
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entitees.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    }



