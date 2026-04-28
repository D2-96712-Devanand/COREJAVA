package com.sunbeam;

enum TrafficLight {
    RED(30),
    GREEN(15),
    YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

class Program {
    public static void main(String[] args) {
    	
        System.out.println("Traffic Light Timings:");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
    }
}
