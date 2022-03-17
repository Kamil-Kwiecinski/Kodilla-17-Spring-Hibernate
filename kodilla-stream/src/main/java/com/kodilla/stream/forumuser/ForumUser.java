package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int publishPosts;

    public ForumUser(int id, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publishPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.publishPosts = publishPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishPosts() {
        return publishPosts;
    }

    @Override
    public String toString() {
        return "User: \n" + " ID: " + String.format("%04d", id) + "\n User name: " + userName + "\n Sex: " + sex  +"\n Date of birth: " + dateOfBirth + "\n Number of posts: " + publishPosts + "\n";
    }

    public int timePeriod(LocalDate startDate, LocalDate endDate){
        Period diff = Period.between(startDate, endDate);
        return diff.getYears();
    }
}
