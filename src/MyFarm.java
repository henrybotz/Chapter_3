import java.util.ArrayList;

abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "FarmAnimal{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", weight=" + weight + ", age=" + age + '}';
    }

    // Abstract method
    public abstract String feedLoadingSchedule();
}

class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name='" + getName() + '\'' + ", gender='" + getGender() + '\'' + ", weight=" + getWeight() + ", age=" + getAge() + ", sound='" + sound + '\'' + '}';
    }

    @Override
    public String feedLoadingSchedule() {
        return "Feed chickens two times a day: 8am and 4pm.";
    }
}

class Cow extends FarmAnimal {
    private String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cow{" + "name='" + getName() + '\'' + ", gender='" + getGender() + '\'' + ", weight=" + getWeight() + ", age=" + getAge() + ", sound='" + sound + '\'' + '}';
    }

    @Override
    public String feedLoadingSchedule() {
        return "Feed cows twice a day: 6am and 4pm. ";
    }
}

class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Duck{" + "name='" + getName() + '\'' + ", gender='" + getGender() + '\'' + ", weight=" + getWeight() + ", age=" + getAge() + ", sound='" + sound + '\'' + '}';
    }

    @Override
    public String feedLoadingSchedule() {
        return "Feed ducks three a day: 8am, 12pm and 6pm.";
    }
}

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        // Creating farm animals
        Chicken chicken = new Chicken("Amelia", "Female", 1.8, 4, "Cluck Cluck");
        Chicken chicken = new Chicken("Dixie", "Female", 1.7, 4, "Cluck Cluck");
        Chicken chicken = new Chicken("Albert", "Male", 1.6, 2, "Cock-a-Doodle-doo");
        Cow cow = new Cow("Molly", "Female", 1600, 3, "Moo");
        Duck duck = new Duck("Donald", "Male", 3.2, 5, "Quack Quack");
        Duck duck = new Duck("Cheese", "Female", 3.6, 5, "Quack Quack");
        // Adding farm animals to the list
        farmAnimals.add(chicken);
        farmAnimals.add(cow);
        farmAnimals.add(duck);

        // Displaying information and sounds of farm animals
        for (FarmAnimal animal : farmAnimals) {
            System.out.println(animal);
            System.out.println("Sound: " + animal.feedLoadingSchedule());
            System.out.println("Feed Schedule: " + animal.feedLoadingSchedule());
            System.out.println();
        }
    }
}

