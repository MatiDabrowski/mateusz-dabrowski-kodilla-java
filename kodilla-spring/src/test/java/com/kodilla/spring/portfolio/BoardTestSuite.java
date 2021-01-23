package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.TaskScheduler;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task to do");
        board.getDoneList().addTask("Done Task");
        board.getInProgressList().addTask("in progress");



        //Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Done Task", board.getDoneList().getTasks().get(0));
        assertEquals("in progress", board.getInProgressList().getTasks().get(0));
    }
}
