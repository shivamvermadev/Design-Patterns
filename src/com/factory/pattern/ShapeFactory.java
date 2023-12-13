package com.factory.pattern;

public class ShapeFactory {
    private ShapeFactory() {}

    public static Shape getShapeObj(String input) {
        switch (input) {
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}