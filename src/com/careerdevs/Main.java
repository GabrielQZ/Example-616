package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//        Example myExample = new Example("Bill", 40);
//        System.out.println( myExample.getName() );
//        System.out.println( myExample.getAge() );


        Car myCar = new Car("Tesla", 100000);

        System.out.println(myCar.getSpeed());

        myCar.printDetails();
        
    }
}
