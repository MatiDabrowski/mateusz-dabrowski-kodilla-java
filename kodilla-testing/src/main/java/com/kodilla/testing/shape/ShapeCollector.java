package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> shapesList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        if(shapesList.contains(shape)){
            shapesList.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapesList.size()) {
            return shapesList.get(n);
        }
        return null;
    }

    public String showFigures(){

        return shapesList.toString();
    }

    public int getFigureQuantity(){

        return shapesList.size();
    }

}
