package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    private double rectangleArea;

    public Rectangle(double rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getAreaValue() {
        return this.rectangleArea;
    }
    public String toString(){
        return getShapeName();
    }
}
