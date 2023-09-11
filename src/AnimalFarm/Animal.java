package AnimalFarm;

public class Animal {
    private String name;
    private double weight;
    private String color;
    
    public Animal(String name, double weight, String color) {
    	this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void speak() {
        System.out.println(name + "울음소리");
    }

    public void displayInfo() {
        System.out.printf("{이름: %s, 몸무게: %.1fkg, 색깔:%s}", name, weight, color);
    }
    

    public String getName() {
        return name;
    }
}
