package com.strategy.pattern.with.strategy.pattern.strategies;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
