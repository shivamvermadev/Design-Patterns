package com.strategy.pattern.with.strategy.pattern.strategies;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }
}
