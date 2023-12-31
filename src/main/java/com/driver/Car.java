package com.driver;

public class Car extends Vehicle {
    public int wheels;
    public String type;
    public int doors;
    public int gears;
    public boolean isManual;
    public int currentGear;
    public int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle

        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.type = type;
        this.isManual = isManual;
        this.seats = seats;

        this.currentGear = 1;

    }
    public Car(String name, boolean isManual){
        super(name);
        this.isManual = isManual;
    }

    public void changeGear(int newGear){

        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public int getCurrentDirection(){
        return currentDirection;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

}