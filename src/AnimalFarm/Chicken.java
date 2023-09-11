package AnimalFarm;

public class Chicken extends Animal {
    public Chicken(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " 짹짹!");
    }
}