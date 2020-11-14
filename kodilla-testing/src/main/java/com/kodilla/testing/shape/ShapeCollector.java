package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<String> shapesList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapesList.add(shape.getShapeName());
    }
    public boolean removeFigure(Shape shape){
        if(shapesList.contains(shape.getShapeName())){
            shapesList.remove(shape.getShapeName());
            return true;
        }
        return false;
    }

    public String getFigure(int n) {
        String figure = shapesList.get(n);
        return figure;
    }

    public String showFigures(){

        return shapesList.toString();
    }

    public int getFigureQuantity(){

        return shapesList.size();
    }

}
