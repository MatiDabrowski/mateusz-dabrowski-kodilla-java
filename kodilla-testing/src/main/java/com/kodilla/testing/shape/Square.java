package com.kodilla.testing.shape;

public class Square implements Shape {
    private double squareArea;

    public Square(double squareArea) {
        this.squareArea = squareArea;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getAreaValue() {
        return this.squareArea;
    }
}
