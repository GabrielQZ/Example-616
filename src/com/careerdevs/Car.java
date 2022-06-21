package com.careerdevs;

public class Car {
    private String company;
    private int speed;

    public Car (String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    public int getSpeed() {
       return speed;
    }

    public String getCompany() {
        return company;
    }

    public void printDetails () {
        System.out.println(company + " car's speed is " + speed + "Km/hr");
    }
}
