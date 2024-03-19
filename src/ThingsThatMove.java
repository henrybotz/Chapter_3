/**  
    * @author Henry Botz
    * @version 1.0
    * ITEC 2150 Spring 2024
    * March 17, 2024
    * ThingsThatMove.java - Same outline as ThingsThatFly.java but the "Airplane" and "Bird" classes implement the "Movement" interface. Stores objects from ThingsThatFly.java in an array list.
    */



interface Flight {
    void fly();
}

interface Movement extends Flight {
    void walk();
    void jump();
}

class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}

class Bird implements Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}

public class ThingsThatMove {
    public static void main(String[] args) {
        // Create objects
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        // Store objects in an array
        Movement[] movingObjects = {airplane, eagle, hummingbird};

        // Print objects and their movements
        for (Movement obj : movingObjects) {
            System.out.println(obj + ":");
            obj.fly();
            obj.walk();
            obj.jump();
            System.out.println();
        }
    }
}
