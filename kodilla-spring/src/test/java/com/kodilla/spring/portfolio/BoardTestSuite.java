package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String taskToDo = "zadanie TODO";
        board.addTaskToToDoList(taskToDo);
        String taskInProgress= "zadanie InProgress";
        board.addTaskToInProgressList(taskInProgress);
        String taskDone = "zadanie Done";
        board.addTaskToDoneList(taskDone);
        //Then
        String task1 = board.getToDoList().getTasks().get(0);
        String task2 = board.getInProgressList().getTasks().get(0);
        String task3 = board.getDoneList().getTasks().get(0);

        Assert.assertEquals(taskToDo, task1);
        Assert.assertEquals(taskInProgress, task2);
        Assert.assertEquals(taskDone, task3);

    }

}
