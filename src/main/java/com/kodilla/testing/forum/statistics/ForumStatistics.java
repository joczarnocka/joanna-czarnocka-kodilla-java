package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    public int usersCount;
    public int postsCount;
    public int commentsCount;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        /*liczbę użytkowników,
        liczbę postów,
        liczbę komentarzy,
        średnią liczbę postów na użytkownika,
        średnią liczbę komentarzy na użytkownika,
        średnią liczbę komentarzy na post.
        * */

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount != 0) {
            averagePostsPerUser = (double) postsCount / usersCount;
            averageCommentsPerUser = (double) commentsCount / usersCount;
        }
        else {
            averagePostsPerUser = (double) 0;
            averageCommentsPerUser = (double) 0;
        }

        if (postsCount != 0)
            averageCommentsPerPost = (double) commentsCount / postsCount;
        else
            averageCommentsPerPost = (double) 0;
    }

}
