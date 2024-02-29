
public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private AquaticAnimal[] aquaticAnimals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo() {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new AquaticAnimal[10];
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[NUMBER_OF_CAGES];
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                float currentDepth = penguin.getSwimmingDepth();
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            }
        }

        if (maxDepth == -1.0f) {
            System.out.println("Aucun pingouin trouvé dans le zoo.");
            return -1.0f;
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                numberOfDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                numberOfPenguins++;
            }
        }

        System.out.println("Nombre de dauphins dans le zoo : " + numberOfDolphins);
        System.out.println("Nombre de pingouins dans le zoo : " + numberOfPenguins);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }

        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo.");
                return false;
            }
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public String getName() {
        return this.name;
    }
    public void setName (String name){
        if (name.isBlank())
            System.out.println("name must contain caractere");
        this.name =name;
    }
    public String getCity(){
        return this.city;
    }
    public void setCity (String city){
        this.city=city;
    }
    public void setNbrAnimals(int nbranimal){
        this.nbrAnimals=nbranimal;
    }
    public int getNbrAnimals(){
        return this.nbrAnimals;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal " + animal.getName() + " n'existe pas dans le zoo.");
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public boolean addAquaticAnimal(AquaticAnimal aquaticAnimal) {
        if (isAquaticAnimalsFull()) {
            System.out.println("Le nombre maximal d'animaux aquatiques a été atteint.");
            return false;
        }
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i].equals(aquaticAnimal)) {
                System.out.println("L'animal aquatique " + aquaticAnimal.getName() + " existe déjà dans le zoo.");
                return false;
            }
        }

        aquaticAnimals[nbrAquaticAnimals] = aquaticAnimal;
        nbrAquaticAnimals++;
        return true;
    }
    private boolean isAquaticAnimalsFull() {
        return nbrAquaticAnimals == 10;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° animals: " + nbrAnimals;
    }
}