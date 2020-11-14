package com.kodilla.testing.shape;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assertions.assertEquals(1, shapeCollector.getFigureQuantity());
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getFigureQuantity());
    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);
        shapeCollector.addFigure(circle);

        //When
        String figureResult = shapeCollector.getFigure(0);

        Assertions.assertEquals("Circle", figureResult);
    }
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);
        Square square = new Square(50);
        Rectangle rectangle = new Rectangle(50);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle);

        //When
        String figuresTxt = shapeCollector.showFigures();

        Assertions.assertEquals("Circle, Square, Rectangle", figuresTxt);

    }
}






























