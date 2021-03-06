package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeSuite(){
        System.out.println("ForumStatistics Test Suite - start");
    }

    @AfterClass
    public static void afterSuite(){
        System.out.println("ForumStatistics Test Suite - all test are finished");
    }

    @Before
    public void beforeTest(){
        testCounter += 1;
        System.out.println("Test number " + testCounter + " started");
    }

    @After
    public void afterTest(){
        System.out.println("Test number " + testCounter + " ended");
    }

    @Test
    public void calculateAdvStatisticsPosts0()
    {
        //Given
        ForumStatistics fs = new ForumStatistics();
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("john");
        userNames.add("robert");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        fs.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, fs.getPostsCount());
        Assert.assertEquals(0, fs.getCommentsCount());
        Assert.assertEquals(2, fs.getUsersCount());
        Assert.assertEquals(0.0, fs.getAveragePostsPerUser(),0);
        Assert.assertEquals(0.0,fs.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0.0,fs.getAverageCommentsPerPost(),0);
    }

    @Test
    public void calculateAdvStatisticsPosts1000()
    {
        //Given
        ForumStatistics fs = new ForumStatistics();
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("john");
        userNames.add("robert");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        fs.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, fs.getUsersCount());
        Assert.assertEquals(1000, fs.getCommentsCount());
        Assert.assertEquals(1000, fs.getPostsCount());
        Assert.assertEquals(500, fs.getAveragePostsPerUser(),0);
        Assert.assertEquals(500,fs.getAverageCommentsPerUser(),0);
        Assert.assertEquals(1.0,fs.getAverageCommentsPerPost(),0);
    }

    @Test
    public void calculateAdvStatisticsComments0()
    {
        //Given
        ForumStatistics fs = new ForumStatistics();
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("john");
        userNames.add("robert");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        fs.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, fs.getUsersCount());
        Assert.assertEquals(0, fs.getCommentsCount());
        Assert.assertEquals(100, fs.getPostsCount());
        Assert.assertEquals(50.0, fs.getAveragePostsPerUser(),0);
        Assert.assertEquals(0.0,fs.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0.0,fs.getAverageCommentsPerPost(),0);
    }

 @Test
 public void calculateAdvStatisticsCommentsLessThanPosts()
 {
     //Given
     ForumStatistics fs = new ForumStatistics();
     Statistics statisticsMock =  mock(Statistics.class);
     List<String> userNames = new ArrayList<>();
     userNames.add("john");
     userNames.add("robert");
     when(statisticsMock.usersNames()).thenReturn(userNames);
     when(statisticsMock.postsCount()).thenReturn(100);
     when(statisticsMock.commentsCount()).thenReturn(10);
     //When
     fs.calculateAdvStatistics(statisticsMock);

     //Then
     Assert.assertEquals(2, fs.getUsersCount());
     Assert.assertEquals(10, fs.getCommentsCount());
     Assert.assertEquals(100, fs.getPostsCount());
     Assert.assertEquals(50.0, fs.getAveragePostsPerUser(),0);
     Assert.assertEquals(5.0,fs.getAverageCommentsPerUser(),0);
     Assert.assertEquals(0.1,fs.getAverageCommentsPerPost(),0);
     Assert.assertTrue(fs.getAverageCommentsPerPost() < 1);
 }

 //gdy liczba komentarzy > liczba postów,
 @Test
 public void calculateAdvStatisticsCommentsMoreThanPosts()
 {
     //Given
     ForumStatistics fs = new ForumStatistics();
     Statistics statisticsMock =  mock(Statistics.class);
     List<String> userNames = new ArrayList<>();
     userNames.add("john");
     userNames.add("robert");
     when(statisticsMock.usersNames()).thenReturn(userNames);
     when(statisticsMock.postsCount()).thenReturn(100);
     when(statisticsMock.commentsCount()).thenReturn(1000);
     //When
     fs.calculateAdvStatistics(statisticsMock);

     //Then
     Assert.assertEquals(2, fs.getUsersCount());
     Assert.assertEquals(1000, fs.getCommentsCount());
     Assert.assertEquals(100, fs.getPostsCount());
     Assert.assertEquals(50.0, fs.getAveragePostsPerUser(),0);
     Assert.assertEquals(500.0,fs.getAverageCommentsPerUser(),0);
     Assert.assertEquals(10.0,fs.getAverageCommentsPerPost(),0);
     Assert.assertTrue(fs.getAverageCommentsPerPost() > 1);
 }

    @Test
    public void calculateAdvStatisticsUsers0()
    {
        //Given
        ForumStatistics fs = new ForumStatistics();
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        fs.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, fs.getUsersCount());
        Assert.assertEquals(1000, fs.getCommentsCount());
        Assert.assertEquals(100, fs.getPostsCount());
        Assert.assertEquals(0.0, fs.getAveragePostsPerUser(),0);
        Assert.assertEquals(0.0,fs.getAverageCommentsPerUser(),0);
        Assert.assertEquals(10.0,fs.getAverageCommentsPerPost(),0);
    }

    @Test
    public void calculateAdvStatisticsUsers100()
    {
        //Given
        ForumStatistics fs = new ForumStatistics();
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            userNames.add("john"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        fs.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, fs.getUsersCount());
        Assert.assertEquals(1000, fs.getCommentsCount());
        Assert.assertEquals(100, fs.getPostsCount());
        Assert.assertEquals(1.0, fs.getAveragePostsPerUser(),0);
        Assert.assertEquals(10.0,fs.getAverageCommentsPerUser(),0);
        Assert.assertEquals(10.0,fs.getAverageCommentsPerPost(),0);
    }

}
