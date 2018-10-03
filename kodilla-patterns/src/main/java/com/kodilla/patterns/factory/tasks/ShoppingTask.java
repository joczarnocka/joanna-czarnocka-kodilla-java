package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private  boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isTaskExecuted = false;

    }

    @Override
    public String executeTask() {
        String execution = "";
        if (isTaskExecuted ) {
            execution = "Task " + taskName + " is already executed";
        } else {
            execution = "Executing " + taskName + ": buying " +
                        quantity + " of " + whatToBuy;
            isTaskExecuted = true;
        }
        System.out.println(execution);
        return execution;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
