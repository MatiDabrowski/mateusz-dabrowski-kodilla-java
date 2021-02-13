package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    @Test
    void testFindByListName(){
        //given
        TaskList taskList  = new TaskList("ToDo", "To Do list");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //when
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //then
        assertEquals(1, readTasks.size());

        //clean
        taskListDao.deleteById(readTasks.get(0).getId());

    }
}
