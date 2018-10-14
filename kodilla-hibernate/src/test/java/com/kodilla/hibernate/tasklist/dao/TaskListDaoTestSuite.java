package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME1 = "TODO";
    private static final String DESCRIPTION1 = "List TODO";
    private static final String LISTNAME2 = "Under progress";
    private static final String DESCRIPTION2 = "List Under progress";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList(LISTNAME1, DESCRIPTION1);
        TaskList taskList2 = new TaskList(LISTNAME2, DESCRIPTION2);

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //Then
        List<TaskList> taskLists = taskListDao.findByListName(LISTNAME1);
        String taskListName = taskLists.get(0).getListName();

        Assert.assertEquals(LISTNAME1, taskListName);
        Assert.assertEquals(1, taskLists.size());

        //CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);
    }
}