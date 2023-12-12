package com.strategy.pattern.with.strategy.pattern;

import com.strategy.pattern.with.strategy.pattern.strategies.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}