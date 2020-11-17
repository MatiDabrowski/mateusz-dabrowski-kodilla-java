package com.kodilla.testing.statistics;
import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    private List<String> usersNamesList;

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("User 1");
        usersNamesList.add("User 2");
        usersNamesList.add("User 3");
        usersNamesList.add("User 4");
        usersNamesList.add("User 5");
        usersNamesList.add("User 6");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
    }

    @Test
    public void postQuantity0() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(40);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.averageCommentsPerPost());
        assertEquals(6.67, calculateStatistics.averageCommentsPerUser(),0.01);
        assertEquals(0, calculateStatistics.averagePostsPerUser());

    }

    @Test
    public void postQuantity1000() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(40);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //calculateStatistics.showStatistics();
        //Then
        assertEquals(0.04, calculateStatistics.averageCommentsPerPost(), 0.01);
        assertEquals(6.67, calculateStatistics.averageCommentsPerUser(), 0.01);
        assertEquals(166.67, calculateStatistics.averagePostsPerUser(), 0.01);

    }

    @Test
    public void commentsQty0() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.averageCommentsPerPost(), 0.01);
        assertEquals(0, calculateStatistics.averageCommentsPerUser(), 0.01);
        assertEquals(166.67, calculateStatistics.averagePostsPerUser(), 0.01);
    }

    @Test
    public void commentsIsLessThanPost() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.005, calculateStatistics.averageCommentsPerPost(), 0.0001);
        assertEquals(0.8333, calculateStatistics.averageCommentsPerUser(), 0.0001);
        assertEquals(166.6667, calculateStatistics.averagePostsPerUser(), 0.0001);
    }

    @Test
    public void commentsIsMoreThanPost() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Given
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(50, calculateStatistics.averageCommentsPerPost(), 0.01);
        assertEquals(166.67, calculateStatistics.averageCommentsPerUser(), 0.01);
        assertEquals(3.33, calculateStatistics.averagePostsPerUser(), 0.01);

    }
    @Test
    public void zeroUsers() {
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usersNamesListZero = new ArrayList<>();
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNamesListZero);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(50, calculateStatistics.averageCommentsPerPost(), 0.01);
        assertEquals(0, calculateStatistics.averageCommentsPerUser(), 0.01);
        assertEquals(0, calculateStatistics.averagePostsPerUser(), 0.01);

    }
    @Test
    public void hundredUsers() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usersNamesListHundred = new ArrayList<>();
        for (int i =0; i<100; i++){
            usersNamesListHundred.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNamesListHundred);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(50, calculateStatistics.averageCommentsPerPost(), 0.01);
        assertEquals(10, calculateStatistics.averageCommentsPerUser(), 0.01);
        assertEquals(0.2, calculateStatistics.averagePostsPerUser(), 0.01);

    }
}