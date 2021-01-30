package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "Shopping task";
    public static final String PAINTINGTASK = "Painting task";
    public static final String DRIVINGTASK = "Driving task";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "Milk", 2);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "blue", "house");
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "to office", "car");
            default:
                return null;
        }

    }


}
