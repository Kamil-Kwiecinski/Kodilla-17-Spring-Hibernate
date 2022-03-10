package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> collection = new ArrayList<>();

    public List<Shape> getCollection() {
        return collection;
    }

    public void addFigure(Shape shape){
        //Add Figure to collection
        collection.add(shape);
    }

    public void removeFigure(Shape shape){
        //Remove Figure from collection
        collection.remove(shape);
    }

    public Shape getFigure(int n){
        //Get Figure from position n
        return collection.get(n);
    }

    public void showFigures(){
        //Get all names from collection
        System.out.println(collection.toString());
    }
}
