// Animal.java
public class Animal {

    private String animalName;
    private String ownerName;
    private int age;

    // Constructor
    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age);
    }

    // Getters
    public String getAnimalName() {
        return animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Name: " + animalName + ", Owner: " + ownerName + ", Age: " + age;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;

        Animal other = (Animal) obj;

        return age == other.age &&
               animalName.equals(other.animalName) &&
               ownerName.equals(other.ownerName);
    }
}


// Dog.java
public class Dog extends Animal {

    private String breed;

    // Constructor
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return "Dog - Name: " + getAnimalName() +
               ", Owner: " + getOwnerName() +
               ", Age: " + getAge() +
               ", Breed: " + breed;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;

        Dog other = (Dog) obj;

        return super.equals(other) &&
               breed.equals(other.breed);
    }
}
