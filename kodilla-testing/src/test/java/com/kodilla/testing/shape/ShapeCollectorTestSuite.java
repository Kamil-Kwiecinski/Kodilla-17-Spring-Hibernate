package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Test is starting.");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("Test is ended.");
    }

    @Nested
    class AddRemove {
        @DisplayName("Test of adding figure is starting.")
        @Test
        void testCaseAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(1, shapeCollector.getCollection().size());
        }

        @DisplayName("Test of removing figure is starting.")
        @Test
        void testCaseRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(1, 3, 5);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            assertEquals(0,shapeCollector.getCollection().size());
        }
    }

    @Nested
    class getInfo {

        @DisplayName("Test of getting figure is starting.")
        @Test
        void testCaseGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(2);
            Shape circle = new Circle(4);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            //When
            Shape result = shapeCollector.getFigure(1);

            //Then
            assertEquals(circle, result);
        }

        @DisplayName("Test of showing figure is starting.")
        @Test
        void testCaseShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(2, 3, 1);
            Shape square = new Square(2);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            ArrayList<Shape> list = new ArrayList<>();
            list.add(triangle);
            list.add(square);

            //When
            List<Shape> resultList = shapeCollector.getCollection();

            //Then
            assertEquals(list.toString(),resultList.toString());
        }
    }
}
