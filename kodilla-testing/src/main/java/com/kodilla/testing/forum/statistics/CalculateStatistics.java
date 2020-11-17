package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {


    private int postsQuantity;
    private int usersQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;



    public void calculateAdvStatistics(Statistics statistics){
        postsQuantity = statistics.postsCount();

        if(statistics.usersNames() == null) {
            usersQuantity = 0 ;
        } else {
            usersQuantity = statistics.usersNames().size();
        }
        commentsQuantity = statistics.commentsCount();
        averageCommentsPerPost =  averageCommentsPerPost();
        averageCommentsPerUser = averageCommentsPerUser();
        averagePostsPerUser = averagePostsPerUser();
    }

    public void showStatistics(){
        System.out.println(postsQuantity);
        System.out.println(usersQuantity);
        System.out.println(commentsQuantity);
        System.out.println(averageCommentsPerPost);
        System.out.println(averageCommentsPerUser);
        System.out.println(averagePostsPerUser);

    }
    public double averageCommentsPerUser(){
        if((commentsQuantity == 0 ) || (usersQuantity == 0)) {
            return 0;
        } else {
            return (double)commentsQuantity / usersQuantity;
        }
    }

    public double averagePostsPerUser(){
        if ((postsQuantity == 0) || (usersQuantity == 0)) {
            return 0;
        } else {
            return (double)postsQuantity / usersQuantity;
        }
    }

    public double averageCommentsPerPost(){
        if ((postsQuantity == 0) || (commentsQuantity == 0 )) {
            return 0;
        } else {
            return (double)commentsQuantity / postsQuantity;
        }
    }
}
