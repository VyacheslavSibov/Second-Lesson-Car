package com.company;

public class CarTest {
    public static void main(String[] args) {
        // ctrl + alt + L
        Car porshe = new Car();

        porshe.manufacturer = ("Name : Ferarri");
        porshe.yearIssue = ("Year issue : 2018 year");
        porshe.machineType = ("Type : Sport Car");
        porshe.bodyType = ("Body Type :Roadster");
        porshe.maxSpeed = ("Max Speed : 320 km/h");
        porshe.tankCapacity = ("Tank Capacity : 78 liter");

        System.out.println(porshe.manufacturer);
        System.out.println(porshe.yearIssue);
        System.out.println(porshe.machineType);
        System.out.println(porshe.bodyType);
        System.out.println(porshe.maxSpeed);
        System.out.println(porshe.tankCapacity);
    }
}
