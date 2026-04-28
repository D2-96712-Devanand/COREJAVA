package com.app.fruits;

public abstract class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }

    public abstract String taste();

    @Override
    public String toString() {
        return String.format("Name: %s, Color: %s, Weight: %.2f kg", name, color, weight);
    }

    // Getters and Setters
    public String getName() { return name; }
    public boolean isFresh() { return isFresh; }
    public void setFresh(boolean fresh) { isFresh = fresh; }
}

