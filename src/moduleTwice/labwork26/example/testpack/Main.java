package moduleTwice.labwork26.example.testpack;

import moduleTwice.labwork26.example.applepack.Apple;
import moduleTwice.labwork26.example.carpsck.Car;

public class Main {
    public static void main(String[] args) {
        Apple apple=new Apple();
        Car car=new Car();

        apple.setMass(0.05);
        car.setMass(1000.66);

        System.out.println("The weight of apple is  " + apple.getMass());
        System.out.println("The weight of car is  " + car.getMass());
    }
}
