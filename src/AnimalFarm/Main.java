package AnimalFarm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("새로운 동물을 추가합니다.");
        System.out.print("종: ");
        String species = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("무게 (kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("색깔: ");
        String color = scanner.nextLine();
        AnimalFarm farm = new AnimalFarm();

        if( species.equals("강아지") || species.equals("개")) {
        	farm.addAnimal(new Dog(name, weight, color));
        }
        if( species.equals("고양이")) {
        	farm.addAnimal(new Cat(name, weight, color));
        }
        if( species.equals("닭")) {
        	farm.addAnimal(new Chicken(name, weight, color));
        }
        

    	System.out.println("검색할 이름을 입력해주세요: ");
    	String findAnimal = scanner.next();
    	

        farm.addAnimal(new Dog("요미", 5, "갈색"));
        farm.addAnimal(new Cat("야옹이", 5.2, "회색"));
        farm.addAnimal(new Chicken("짹짹이", 2.0, "하얀색"));

        Animal foundAnimal = farm.findAnimalByName(findAnimal);
        if (foundAnimal != null) {
            foundAnimal.speak();
            System.out.println();
        }

        System.out.println("모든 동물들이 짖게 합니다");
        farm.makeAllAnimalsSpeak();

        System.out.println("모든 동물들의 특징을 표로 나타냅니다");
        farm.displayAllAnimalInfo();
    }
    

 
}






