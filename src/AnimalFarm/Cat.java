package AnimalFarm;

public class Cat extends Animal {
    public Cat(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " 미야옹!");
    }
}