package com.strategy.pattern.with.strategy.pattern;

import com.strategy.pattern.with.strategy.pattern.strategies.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
