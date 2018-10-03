package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private  boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isTaskExecuted = false;
    }
    @Override
    public String executeTask() {
        String execution = "";
        if (isTaskExecuted ) {
            execution = "Task " + taskName + " is already executed";
        } else {
            execution = "Executing " + taskName + ": painting " +
                    whatToPaint + " in " + color;
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
