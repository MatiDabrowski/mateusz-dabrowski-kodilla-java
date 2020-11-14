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
        Square square = new Square(50);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        int beforeRemoveQuantity = shapeCollector.getFigureQuantity();

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then

        Assertions.assertTrue(result);
        Assertions.assertEquals(beforeRemoveQuantity -1, shapeCollector.getFigureQuantity());
    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);
        Square square = new Square(50);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //When
        String figureResult = shapeCollector.getFigure(1);

        //Then
        Assertions.assertEquals("Square", figureResult);
    }
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(50);
        Square square = new Square(50);
        Rectangle rectangle = new Rectangle(50);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(rectangle);


        //When
        String figuresTxt = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals("[Circle, Square, Rectangle]", figuresTxt);

    }
}






























