package com.factory.pattern;

public class Main {
    public static void main(String[] args) {
        Shape shapeObj = ShapeFactory.getShapeObj("circle");
        if(shapeObj != null) {
            shapeObj.draw();
        }
    }
}
