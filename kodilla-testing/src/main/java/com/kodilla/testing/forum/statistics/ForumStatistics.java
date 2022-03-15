package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsOnUser;
    private double averageCommentsOnUser;
    private double averageCommentsOnPosts;


    List<String> usersNames(){
        List<String> userList = new ArrayList<>();
        return userList;
    }

    int postsCount(){
        return postsNumber;
    }

    int commentsCount(){
        return  commentsNumber;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(usersNumber > 0){
            averagePostsOnUser = postsNumber / usersNumber;
            averageCommentsOnUser = commentsNumber/usersNumber;
        } else{
            averagePostsOnUser = 0;
            averageCommentsOnUser = 0;
        }
        if (postsNumber > 0){
            averageCommentsOnPosts = commentsNumber/postsNumber;
        } else{
            averageCommentsOnPosts = 0;
        }
    }

    public void showStatistics(Statistics statistics){
        System.out.println("Statistics of forum:");
        System.out.println("Users on forum: " + usersNumber);
        System.out.println("Posts on forum: " + postsNumber);
        System.out.println("Comments on forum: " + commentsNumber);
        System.out.println("Average posts on one user: " + averagePostsOnUser);
        System.out.println("Average comments on one user: " + averageCommentsOnUser);
        System.out.println("Average comments on one post: " + averageCommentsOnPosts);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsOnUser() {
        return averagePostsOnUser;
    }

    public double getAverageCommentsOnUser() {
        return averageCommentsOnUser;
    }

    public double getAverageCommentsOnPosts() {
        return averageCommentsOnPosts;
    }
}
