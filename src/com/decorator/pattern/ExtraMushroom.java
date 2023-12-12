package com.decorator.pattern;

public class ExtraMushroom extends ToppingDecorator {

    private BasePizza basePizza;
    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
