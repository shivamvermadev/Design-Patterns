package com.strategy.pattern.with.strategy.pattern;

import com.strategy.pattern.with.strategy.pattern.strategies.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
