package com.strategy.pattern.with.strategy.pattern;

import com.strategy.pattern.with.strategy.pattern.strategies.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
