package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy drink", "Water", 2);

            case PAINTINGTASK:
                return new PaintingTask("Paint walls", "Yellow", "Walls");

            case DRIVINGTASK:
                return new DrivingTask("Driving", "To city", "Bike");

            default:
                return new WrongTask();
        }
    }
}
