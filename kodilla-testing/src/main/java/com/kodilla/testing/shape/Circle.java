package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double circleArea;

    public Circle(double circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getAreaValue() {
        return this.circleArea;
    }

    public String toString(){
        return getShapeName();
    }
}
