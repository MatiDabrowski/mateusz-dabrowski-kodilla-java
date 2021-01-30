package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testTaskFactory(){
        //given
        TaskFactory taskFactory = new TaskFactory();

        //when
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
        assertEquals("Driving task", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());



    }
}
