package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testQueueUpdate(){
        //Given
        Queue traineeA = new TraineeA();
        Queue traineeB = new TraineeB();
        Queue traineeC = new TraineeC();
        Queue traineeD = new TraineeD();
        Mentor mentorM1 = new Mentor("Mentor1");
        Mentor mentorM2 = new Mentor("Mentor2");

        traineeA.registerObserver(mentorM1);
        traineeB.registerObserver(mentorM1);
        traineeC.registerObserver(mentorM2);
        traineeD.registerObserver(mentorM2);

        //When
        traineeA.addTask("task 1");
        traineeA.addTask("task 2");
        traineeA.addTask("task 3");
        traineeB.addTask("task 1");
        traineeB.addTask("task 2");
        traineeC.addTask("task 1");
        traineeC.addTask("task 2");
        traineeC.addTask("task 3");
        traineeC.addTask("task 4");
        traineeD.addTask("task 1");
        traineeD.addTask("task 2");

        //Then
        assertEquals(5, mentorM1.getUpdateCount());
        assertEquals(6, mentorM2.getUpdateCount());

    }
}
