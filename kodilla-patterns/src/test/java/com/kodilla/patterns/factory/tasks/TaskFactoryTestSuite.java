package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.TASK_TYPE_SHOPPING);
        //Then
        Assert.assertEquals(false, shopping.isTaskExecuted());
        Assert.assertEquals("shopping1", shopping.getTaskName());
        Assert.assertEquals("Executing " + shopping.getTaskName()
                +": buying 20.0 of bananas", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.TASK_TYPE_PAINTING);
        //Then
        Assert.assertEquals(false, painting.isTaskExecuted());
        Assert.assertEquals("painting1", painting.getTaskName());
        Assert.assertEquals("Executing " + painting.getTaskName()
                +": painting wall in blue", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.TASK_TYPE_DRIVING);
        //Then
        Assert.assertEquals(false, driving.isTaskExecuted());
        Assert.assertEquals("driving1", driving.getTaskName());
        Assert.assertEquals("Executing " + driving.getTaskName()
                +": driving to home by car", driving.executeTask());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

}
