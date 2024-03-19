/**  
    * @author Henry Botz
    * @version 1.0
    * ITEC 2150 Spring 2024
    * March 17, 2024
    * ThingsThatFly.java - Processes different objects that can fly through the interface they implement.
    */



interface Flight {
    void fly();
}

class Airplane implements Flight {
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
        System.out.println("I’m an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString() {
        return "Airplane{" + "model='" + model + '\'' + ", yearBuilt=" + yearBuilt + '}';
    }
}

class Bird implements Flight {
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
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    @Override
    public String toString() {
        return "Bird{" + "type='" + type + '\'' + '}';
    }
}

public class ThingsThatFly {
    public static void main(String[] args) {
        // Create objects
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird hummingbird = new Bird("Hummingbird");
        Bird eagle = new Bird("Eagle");

        // Store objects in an array list
        Flight[] flyingObjects = {airplane, hummingbird, eagle};

        // Print objects and how they fly
        for (Flight obj : flyingObjects) {
            System.out.println(obj);
            obj.fly();
            System.out.println();
        }
    }
}
