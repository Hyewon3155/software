package AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {
    private List<Animal> animals;

    public AnimalFarm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void makeAllAnimalsSpeak() {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public void displayAllAnimalInfo() {
        for (Animal animal : animals) {
            animal.displayInfo();
            System.out.println();
        }
    }
}
