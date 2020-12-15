package com.codegym;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    //getter and setter

    //getter
    public String getName(){
        return this.name;
    }
    public String getEngine(){
        return this.engine;
    }
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setEngine(){
        this.engine = engine;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
}
