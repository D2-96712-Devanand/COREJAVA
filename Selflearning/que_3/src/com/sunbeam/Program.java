package com.sunbeam;

import java.util.*;

class Enclosure {
    String type; 
    Enclosure(String type) { this.type = type; }
}

abstract class Animal {
    String name;
    Enclosure enclosure;

    Animal(String name, String enclosureType) {
        this.name = name;
        this.enclosure = new Enclosure(enclosureType);
    }

    abstract void makeSound();
    
    void displayInfo() {
        System.out.println(name + " lives in a " + enclosure.type + " enclosure.");
    }
}

// IS-A: Lion is an Animal
class Lion extends Animal {
    Lion(String name) { super(name, "Savannah"); }
    
    @Override
    void makeSound() { System.out.println(name + " says: Roar!"); }
}

// IS-A: Penguin is an Animal
class Penguin extends Animal {
    Penguin(String name) { super(name, "Aquatic"); }

    @Override
    void makeSound() { System.out.println(name + " says: Honk!"); }
}

class Zoo {
    String zooName;
    List<Animal> animals = new ArrayList<>(); // HAS-A Relationship

    Zoo(String zooName) { this.zooName = zooName; }

    void addAnimal(Animal a) { animals.add(a); }

    void startDay() {
        System.out.println("Welcome to " + zooName + "!");
        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("City Safari");

        myZoo.addAnimal(new Lion("Simba"));
        myZoo.addAnimal(new Penguin("Pingu"));

        myZoo.startDay();
    }
}
