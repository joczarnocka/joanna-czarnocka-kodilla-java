package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String TASK_TYPE_SHOPPING = "Shopping";
    public static final String TASK_TYPE_PAINTING = "Painting";
    public static final String TASK_TYPE_DRIVING = "Driving";

    public final Task makeTask(final String taskType){
        switch (taskType) {
            case TASK_TYPE_SHOPPING:
                return new ShoppingTask("shopping1","bananas",20);
            case TASK_TYPE_PAINTING:
                return new PaintingTask("painting1","blue","wall");
            case TASK_TYPE_DRIVING:
                return new DrivingTask("driving1","home","car");
            default:
                return null;
        }
    }
}
