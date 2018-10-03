package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;
    private  boolean isTaskExecuted;

    DrivingTask(String taskName, String where, String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isTaskExecuted = false;

    }

    @Override
    public String executeTask() {
        String execution = "";
        if (isTaskExecuted ) {
            execution = "Task " + taskName + " is already executed";
        } else {
            execution = "Executing " + taskName + ": driving to " +
                    where + " by " + using;
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
